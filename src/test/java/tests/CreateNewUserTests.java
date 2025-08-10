package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import models.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import specs.BaseSpecs;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@Owner("Yuferev")
@Epic("Api test")
@Feature("Create new user tests")
public class CreateNewUserTests {

    @Test
    @DisplayName("Создание нового пользователя")
    void createNewUserTest() {
        CreateNewUserRequestLombokModel createData = new CreateNewUserRequestLombokModel("morpheus","leader");

        CreateNewUserResponseLombokModel response = step("Make tequest", () -> given(BaseSpecs.reqSpec)
                .header("x-api-key", "reqres-free-v1")
                .body(createData)
                .post("/users")
                .then()
                .spec(BaseSpecs.returnResSpec(201))
                .extract().body().as(CreateNewUserResponseLombokModel.class));

        step("Check responce", () -> {
            assertEquals("morpheus", response.getName());
            assertEquals("leader", response.getJob());
            assertNotNull(response.getId());
            assertNotNull(response.getCreatedAt());
        });
    }


}
