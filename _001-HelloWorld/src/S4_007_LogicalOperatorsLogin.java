import java.util.Scanner;

public class S4_007_LogicalOperatorsLogin {

    public static void main(String[] args) {

        String username = "gpioli";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter username: ");

        String u = scanner.next();

        System.out.println("Please, enter password: ");
        String p = scanner.next();

        boolean isAuthenticated = false;

        if( (username.equals(u) && password.equals(p)) ||
                (username2.equals(u) && password2.equals(p)) ){
            isAuthenticated = true;
        } else {
            System.out.println("Wrong user or password.");
        }


        if(isAuthenticated){
            System.out.println("Welcome user ".concat(u).concat("!"));
        } else {
            System.out.println("Sorry, authentication required. ");
        }
    }
}
