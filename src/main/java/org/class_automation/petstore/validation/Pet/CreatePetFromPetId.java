package org.class_automation.petstore.validation.Pet;

import io.restassured.response.Response;
import org.testng.Assert;
import resDocument.PetStoreSetting;

import static io.restassured.RestAssured.given;

public class CreatePetFromPetId {
    private static PetStoreSetting petStoreSetting = new PetStoreSetting();
    private static InfoPet infoPet = new InfoPet();

    /**
     * return statusCode from PetId
     *
     * @return
     */
    public int statusCodePetPetId() {
        Response response = given()
                .header("accept", "application/json")
                .contentType("application/x-www-form-urlencoded")
                .formParam("name", infoPet.getNamePet())
                .formParam("status", "Success")
                .post(petStoreSetting.hostDomain + petStoreSetting.pet + "/" + infoPet.getPetId());

        int statusCode = response.then().extract().statusCode();
        System.out.println(statusCode);
        return statusCode;
    }

    public String messagePetPetId() {
        Response response = given()
                .header("accept", "application/json")
                .contentType("application/x-www-form-urlencoded")
                .formParam("name", infoPet.getNamePet())
                .formParam("status", "Success")
                .post(petStoreSetting.hostDomain + petStoreSetting.pet + "/" + infoPet.getPetId());

        String message = response.then().extract().jsonPath().getJsonObject("message");
        System.out.println(message);
        return message;
    }

}
