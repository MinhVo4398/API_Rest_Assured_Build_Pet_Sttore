package org.class_automation.petstore.validation.Pet;

import io.restassured.response.Response;
import resDocument.PetStoreSetting;

import static io.restassured.RestAssured.*;

public class InfoPet {
    private static PetStoreSetting petStoreSetting = new PetStoreSetting();

    /**
     * return petId
     *
     * @return
     */
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

    /**
     * Verify Name Pet of Create API Pet
     *
     * @return
     */
    public String getNamePet() {
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


        String namePet = response.then().extract().response().path("name");
        System.out.println(namePet);
        return namePet;
    }

    /**
     * Verify Status Code of Create API Pet
     *
     * @return
     */
    public int statusCodePet() {
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


        int statusCode = response.then().extract().statusCode();
        System.out.println(statusCode);
        return statusCode;
    }

    public long getPetId1() {
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


        long id = response.then().extract().jsonPath().getJsonObject("id");
        System.out.println(id);
        return id;
    }

}
