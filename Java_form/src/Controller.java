import java.util.List;

public class Controller {
    private String message;
    
    // Login with Credentials
    public String login(String[]  credentials){
        try {
            User user = new User();
            message = user.login(credentials);
            return this.message;

        } catch (Exception e) {
            this.message = "Something went wrong, please try again later!";
            return this.message;
        }  
    }

    public String registration(String[]  info){
        try {
            User user = new User();

            message = user.create(info);

            return this.message;

        } catch (Exception e) {
            // TODO: handle exception

            this.message = "Something went wrong, please try again later!";

            return this.message;
        }  

    }

    // Get list of pakistan Cities in DropDown list
    public static List<String> getCities() {
        List<String> cities = PakistanCities.getCities();
        return cities;
    }

}
