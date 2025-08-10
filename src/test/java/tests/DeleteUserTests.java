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
@Feature("Delete user tests")
public class DeleteUserTests {

    @Test
    @DisplayName("Удаление пользователя")
    void deleteUserTest() {
        step("Make tequest", () -> given(BaseSpecs.reqSpec)
                .header("x-api-key", "reqres-free-v1")
                .delete("/users/2")
                .then()
                .spec(BaseSpecs.returnResSpec(204)));

    }

}
