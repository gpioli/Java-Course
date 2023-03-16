import java.util.Properties;

public class S9_001_SystemProperties {
    public static void main(String[] args) {

        // More info here: https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + " this will print in a new line");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2 = " + lineSeparator2 + "this will print in a new line");

        // Let's print all yhe system properties
        Properties p = System.getProperties();
        p.list(System.out);

    }
}
