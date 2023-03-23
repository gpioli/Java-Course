public class S11_001_ArgsCommandLine {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("You must enter at least one argument");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument n° " + i + " : " + args[i]);
        }

        // compile: javac <filename.java>
        // run: java <filename.class>

        // java S11_001_ArgsCommandLine Gaston Ana Laura

        // Response:
        // Argument n° 0 : Gaston
        // Argument n° 1 : Ana
        // Argument n° 2 : Laura

    }
}
