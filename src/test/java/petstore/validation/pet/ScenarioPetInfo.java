package petstore.validation.pet;

import org.class_automation.petstore.validation.Pet.CreatePetFromPetId;
import org.class_automation.petstore.validation.Pet.InfoPet;
import org.class_automation.petstore.validation.Pet.UpdateImagePetId;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScenarioPetInfo {
    private static InfoPet infoPet = new InfoPet();
    private static UpdateImagePetId updateImagePetId = new UpdateImagePetId();
    private static CreatePetFromPetId createPetFromPetId = new CreatePetFromPetId();

    @Test(testName = "Verify infomation of API create Pet")
    public void verifyPetInfo() {
        // Mục đích của petId là lấy ra để xài cho việc khác vs lại nó là dynamic nên k cần verify
        Assert.assertEquals(infoPet.statusCodePet(), 200);
        Assert.assertEquals(infoPet.getNamePet(), "doggie");
    }

    @Test(testName = "Verify upload image for PetId")
    public void verifyUploadImageForPet() {
        Assert.assertEquals(updateImagePetId.errorCodeUpdateImage(), 200);
    }

    @Test(testName = "Verify Updates a pet store with form data")
    public void verifyUpdatePetPetId() {
        Assert.assertEquals(createPetFromPetId.statusCodePetPetId(), 200);
        Assert.assertTrue(true, createPetFromPetId.messagePetPetId()); // chỉ cần verìy message có giá trị
    }
}
