package org.class_automation.petstore.validation.Pet;

import io.restassured.response.Response;
import resDocument.PetStoreSetting;

import java.io.File;

import static io.restassured.RestAssured.given;

public class UpdateImagePetId {
    private static PetStoreSetting petStoreSetting = new PetStoreSetting();
    private static InfoPet infoPet = new InfoPet();

    public int errorCodeUpdateImage() {
        Response response = given()
                .header("accept", "application/json")
                .contentType("multipart/form-data")
                .multiPart("additionalMetadata", 1)
                .multiPart("file", new File(System.getProperty("user.dir") + "/1.png"))
                .post(petStoreSetting.hostDomain + "/pet/" + infoPet.getPetId() + "/uploadImage");


        int statusCode = response.then().extract().statusCode();
        System.out.println(statusCode);
        return statusCode;
    }
}
