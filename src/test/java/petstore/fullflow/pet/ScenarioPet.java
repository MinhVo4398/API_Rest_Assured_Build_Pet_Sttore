package petstore.fullflow.pet;

import org.class_automation.petstore.fullow.Pet.GetPet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScenarioPet {
    private static GetPet getPet = new GetPet();

    @Test(testName = "Get Satus Code with petId")
    public void verifyPetInfo() {
        Assert.assertEquals(getPet.errorCodegetPetId(), 200);
    }

}
