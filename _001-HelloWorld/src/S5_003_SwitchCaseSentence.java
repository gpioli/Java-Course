public class S5_003_SwitchCaseSentence {
    public static void main(String[] args) {
        int num = 8;
        switch (num) {
            case 0:
                System.out.println("Number is cero");
                break;
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            case 3:
                System.out.println("Number is three");
                break;
            default:
                System.out.println("Number unknown");
        }

        String name = "Gaston";

        switch (name) {
            case "admin":
                System.out.println("Hello admin, welcome");
                break;
            case "Gaston":
                System.out.println("Welcome Gaston!");
                break;
            case "pepe":
                System.out.println("Hello pepe");
                break;
            default:
                System.out.println("Hello user");
        }
    }
}
