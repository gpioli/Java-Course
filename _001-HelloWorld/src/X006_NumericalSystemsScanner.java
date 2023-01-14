import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class X006_NumericalSystemsScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an Integer number: ");

        int decNumber = 0;
        try {
            decNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: only integer numers are accepted");
            main(args); // if the error happens, the idea is to repeat the process
            System.exit(0);
        }

        System.out.println("Decimal number = " + decNumber);


        String message = "Binary number of " + decNumber + " = " + Integer.toBinaryString(decNumber);
        message += "\nOctal number of " + decNumber + " = " + Integer.toOctalString(decNumber);
        message += "\nHexadecimal number of " + decNumber + " = " + Integer.toHexString(decNumber);
        System.out.println(message);
    }
}
