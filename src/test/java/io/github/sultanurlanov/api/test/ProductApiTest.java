package io.github.sultanurlanov.api.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ProductApiTest {

    @Test
    public void testGetProducts() {

                 given()
                         .when()
                .get("https://api.practicesoftwaretesting.com/products")
                         .then()
                         .statusCode(200);



    }
}
