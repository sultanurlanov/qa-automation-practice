package io.github.sultanurlanov.api.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserApiTest {

    @Test
    public void testRegisterUser() {

        String requestBody = "{"
                + "\"first_name\": \"Sultan\","
                + "\"last_name\": \"Nurlanov\","
                + "\"address\": {\"street\": \"7 April\", \"city\": \"Bishkek\", \"country\": \"Kyrgyzstan\", \"postal_code\": \"720000\", \"state\": \"Chui\"},"
                + "\"phone\": \"996550667567\","
                + "\"dob\": \"1994-08-13\","
                + "\"password\": \"Test12321!\","
                + "\"email\": \"sultan" + System.currentTimeMillis() + "@test.com\""
                + "}";

        given()
                .header("Content-Type","application/json")
                .body(requestBody)
                .when()
                .post("https://api.practicesoftwaretesting.com/users/register")
                .then()
                .statusCode(201);
    }
}
