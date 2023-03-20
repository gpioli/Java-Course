import java.io.FileInputStream;
import java.util.Properties;

public class S9_002_PersonalizedSystemProperties {

    public static void main(String[] args) {

        // In this class we create the file config.properties
        try {
            FileInputStream file = new FileInputStream("src/config.properties");

            // We load the system properties or configuration
            Properties p = new Properties(System.getProperties());
            // And also our personalized properties
            p.load(file);

            // Another way of adding properties:
            p.setProperty("my.property.personalized","My saved value in the properties object");


            // Finally we must set the properties to the System Properties
            System.setProperties(p);

            // Get a single property
            String singleProperty = System.getProperty("config.author.email");
            System.out.println("singleProperty = " + singleProperty);

            // Get all properties
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("File does not exist = " + e);

        }

    }
}
