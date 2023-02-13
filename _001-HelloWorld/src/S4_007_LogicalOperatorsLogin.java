import java.util.Scanner;

public class S4_007_LogicalOperatorsLogin {

    public static void main(String[] args) {

        // we start also working with arrays ()
/*        String[] usernames = new String[2]; // this reservates two spaces in memory for this array
        String[] passwords = new String[2];

        usernames[0] = "gpioli";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";*/

        //another name to define the arrays:
        String[] usernames = {"gpioli","admin", "pepe"};
        String[] passwords = {"123","1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter username: ");

        String u = scanner.next();

        System.out.println("Please, enter password: ");
        String p = scanner.next();

        boolean isAuthenticated = false;

        // if the list or array is big, it would be a better implementation using if instead of the ternary operator
        // because we cant use break in the ternary
        for(int i = 0; i< usernames.length; i++){
            isAuthenticated = usernames[i].equals(u) && passwords[i].equals(p) ? true : isAuthenticated;
        }
/*            if(usernames[i].equals(u) && passwords[i].equals(p)){
                isAuthenticated = true;
                break;
            }
        }*/


        String message = isAuthenticated ? "Welcome user ".concat(u).concat("!") :
                "Wrong user or password.\nSorry, authentication required. ";

        System.out.println(message);

/*        if(isAuthenticated){
            System.out.println("Welcome user ".concat(u).concat("!"));
        } else {
            System.out.println("Wrong user or password.");
            System.out.println("Sorry, authentication required. ");
        }*/
    }
}
