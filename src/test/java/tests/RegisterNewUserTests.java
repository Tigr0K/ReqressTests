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
@Feature("Registration tests")
public class RegisterNewUserTests {

    @Test
    @DisplayName("Регистрация нового пользователя")
    void registerUserLombokPositiveCastomAllure() {
        RegisterBodyLombokModel authData = new RegisterBodyLombokModel();
        authData.setEmail("eve.holt@reqres.in");
        authData.setPassword("pistol");
        RegisterResponseLombokBodyModel responce = step("Make request", () -> given(BaseSpecs.reqSpec)
                .header("x-api-key", "reqres-free-v1")
                .body(authData)
                .post("/register")
                .then()
                .spec(BaseSpecs.returnResSpec(200))
                .extract().body().as(RegisterResponseLombokBodyModel.class));

        step("Check responce", () -> {
            assertEquals("QpwL5tke4Pnpja7X4", responce.getToken());
            assertEquals(4, responce.getId());
        });

    }
}
