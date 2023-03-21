import java.io.IOException;

public class S9_004_ExampleExecuteProgramSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process process;


        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")){
                process = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nix") ||
                System.getProperty("os.name").toLowerCase().contains("nux")) {
                process = rt.exec("gedit");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        } catch (Exception e) {
            System.err.println("Unknown command: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Text editor has been closed");
        System.exit(0);



    }
}
