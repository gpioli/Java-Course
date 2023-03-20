import java.util.Map;

public class S9_003_EnvironmentVariables {
    public static void main(String[] args) {

        Map<String, String> envVar = System.getenv();
        System.out.println("Environment variables of the system = " + envVar);

        System.out.println(" ------ Listing environment variables of the system ------");
        for (String key: envVar.keySet()
             ) {
            System.out.println(key + " => " +envVar.get(key));
        }

        System.out.println("--------------------------");

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);
        // Here we obtain the same value but from a dict / map
        String path2 = envVar.get("Path");
        System.out.println("path2 = " + path2);
        
        



    }
}
