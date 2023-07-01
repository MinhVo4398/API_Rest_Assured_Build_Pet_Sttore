package resDocument;

public class PetStoreSetting {

    public static final String hostDomain = "https://petstore.swagger.io/v2";

    // Endpoint environment

    // Pet
    public static final String uploadImage = "/pet/{petId}/uploadImage";
    public static final String pet = "/pet";
    public static final String findByStatus = "/pet/findByStatus";
    public static final String petPetId = "/pet/{petId}";


    //Store
    public static final String orderStore = "/store/order";
    public static final String orderIdStore = "/store/order/{orderId}";
    public static final String inventoryStore = "/store/inventory";

    // User
    public static final String createWithArray = "/user/createWithArray";
    public static final String createWithList = "/user/createWithList";
    public static final String userName = "/user/{username}";
    public static final String login = "/user/login";
    public static final String logout = "/user/logout";
    public static final String user = "/user";


}
