import javax.json.Json;
import java.net.MalformedURLException;
import java.net.URL;

public class Data {
    // number of people to return to file
    private final int STARTING_NUMBER = 0;
    private final int ENDING_NUMBER = 200;

    // TODO: variables to store people data
    private String personName;
    private String gender;
    private String personBio;
    private String imageURL;


//    public static void main() {
//        // Grab some people
//
//        // loop for the number of people returned
//        while (Json object remains) {
//            callToApi();
//            createInsertStatement();
//            writeToFile();
//        }
//
//    }

    // TODO: Call out to person API
    public void callToApi(String imageURL) throws MalformedURLException {
        URL url = new URL(imageURL);
    }

    // TODO: Construct Insert around person returned
    public void createInsertStatement() {
        String insertString = "INSERT INTO fantastic_umbrella.people (gender, name, description, image_url)"
              +  "VALUES ('gender','personName','personBio','imageURL');";

    }

    // TODO: Write insert statements to file
    public void writeToFile() {

    }

}