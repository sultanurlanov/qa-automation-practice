package io.github.sultanurlanov.api.test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserApiTest {

    @Test
    public void testRegisterUser() {

        String emailResponse =  "sultan" + System.currentTimeMillis() + "@test.com";

        String requestBody = "{"
                + "\"first_name\": \"Sultan\","
                + "\"last_name\": \"Nurlanov\","
                + "\"address\": {\"street\": \"7 April\", \"city\": \"Bishkek\", \"country\": \"Kyrgyzstan\", \"postal_code\": \"720000\", \"state\": \"Chui\"},"
                + "\"phone\": \"996550667567\","
                + "\"dob\": \"1994-08-13\","
                + "\"password\": \"Test12321!\","
                + "\"email\": \"" + emailResponse + "\""
                + "}";

        Response response  = given()
                .header("Content-Type","application/json")
                .body(requestBody)
                .when()
                .post("https://api.practicesoftwaretesting.com/users/register");

                response.then()
                .statusCode(201);

                String userId = response.jsonPath().getString("id");
                String email = response.jsonPath().getString("email");
                String password = response.jsonPath().getString("password");

        Assert.assertEquals(email, emailResponse);
        Assert.assertNull(password);


        System.out.println("UserID: " + userId);
    }
}
