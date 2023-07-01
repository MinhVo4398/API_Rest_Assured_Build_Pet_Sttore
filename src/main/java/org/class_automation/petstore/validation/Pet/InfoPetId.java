package org.class_automation.petstore.validation.Pet;

import io.restassured.response.Response;
import resDocument.PetStoreSetting;

import static io.restassured.RestAssured.*;

public class InfoPetId {

    private static PetStoreSetting petStoreSetting = new PetStoreSetting();

    public long getPetId() {
        Response response = given()
                .header("accept", "application/json")
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .post(petStoreSetting.hostDomain + petStoreSetting.pet);


        long petId = response.then().extract().response().path("id");
        System.out.println(petId);
        return petId;


    }
}
