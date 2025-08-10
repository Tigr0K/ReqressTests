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
@Feature("Get user tests")
public class GetUserTests {

    @Test
    @DisplayName("Получение одного пользователя позитивный")
    void getSingleUserPositiveTest() {
        GetUserResponseLombokModel responce = step("Make request", () -> given(BaseSpecs.reqSpec)
                .header("x-api-key", "reqres-free-v1")
                .get("/users/2")
                .then()
                .spec(BaseSpecs.returnResSpec(200))
                .extract().body().as(GetUserResponseLombokModel.class));

        step("Check responce", () -> {
            assertEquals(2, responce.getData().getId());
            assertEquals("janet.weaver@reqres.in", responce.getData().getEmail());
            assertEquals("Janet", responce.getData().getFirst_name());
            assertEquals("Weaver", responce.getData().getLast_name());
            assertEquals("https://reqres.in/img/faces/2-image.jpg", responce.getData().getAvatar());
        });
    }

    @Test
    @DisplayName("Получение одного пользователя пользователь не найден")
    void getSingleUserNotFoundTest() {
        step("Make tequest", () -> given(BaseSpecs.reqSpec)
                .header("x-api-key", "reqres-free-v1")
                .get("/users/23")
                .then()
                .spec(BaseSpecs.returnResSpec(404))
                .extract().body().as(GetUserResponseLombokModel.class));

    }


}
