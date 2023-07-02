package org.class_automation.petstore.fullow.Pet;

import io.restassured.response.Response;
import org.class_automation.petstore.validation.Pet.InfoPet;

import static io.restassured.RestAssured.given;


// Full flow => Create Pet - Get Pet
public class GetPet {
    private static InfoPet infoPet = new InfoPet();

    public int errorCodegetPetId() {
        long petId = infoPet.getPetId1();
        Response response = given()
                .header("accept", "application/json")
                .get("https://petstore.swagger.io/v2/pet/" + petId);

        int statusCode = response.then().extract().statusCode();
        System.out.println(statusCode);
        return statusCode;
    }


}
