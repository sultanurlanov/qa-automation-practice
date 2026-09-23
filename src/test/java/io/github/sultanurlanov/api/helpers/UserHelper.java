package io.github.sultanurlanov.api.helpers;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.given;

public class UserHelper {


    public static final String PASSWORD = "Test12321!";

    public static String createUser() {

        String email = "test" + System.currentTimeMillis() + "@gmail.com";

        String requestBody = "{"
                + "\"first_name\": \"Test\","
                + "\"last_name\": \"Testov\","
                + "\"address\": {\"street\": \"7 April\", \"city\": \"Bishkek\", \"country\": \"Kyrgyzstan\", \"postal_code\": \"720000\", \"state\": \"Chui\"},"
                + "\"phone\": \"996550667567\","
                + "\"dob\": \"1994-08-13\","
                + "\"password\": \""+ PASSWORD + "\","
                + "\"email\": \"" + email + "\""
                + "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("https://api.practicesoftwaretesting.com/users/register");

        response.then()
                .statusCode(201);

        return email;
    }
}
