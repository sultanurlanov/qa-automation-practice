package io.github.sultanurlanov.api.test;

import org.checkerframework.checker.units.qual.N;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ProductApiTest {

    @Test
    public void testGetProducts() {

                 given()
                         .when()
                .get("https://api.practicesoftwaretesting.com/products")
                         .then()
                         .statusCode(200);
    }

    @Test
    public void testProductsBody() {

        given()
                .when()
                .get("https://api.practicesoftwaretesting.com/products")
                .then()
                .statusCode(200)
                .body("data", hasSize(9))
                .body("data[0].name",equalTo("Combination Pliers"));
    }
}
