/*Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo
de multiplicación (*).
Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class T009_MultiplicationWithoutSymbols {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int firstNum;
        boolean firstNumPositive = true;
        int secondNum;
        boolean secondNumPositive = true;

        int result = 0;

        System.out.println("Welcome to the muliplication system 3000!");
        try {
            System.out.println("Please, enter the first integer to multiply: ");
            firstNum = s.nextInt();
            System.out.println("Please, enter the second integer to multiply: ");
            secondNum = s.nextInt();

            if (firstNum < 0) {
                firstNumPositive = false;
                firstNum = - firstNum;
            }
            if (secondNum < 0) {
                secondNumPositive = false;
                secondNum = - secondNum;
            }

            for (int i = 0; i < firstNum; i++) {
                result = result + secondNum;
            }

            if ((firstNumPositive && secondNumPositive) || (!firstNumPositive && !secondNumPositive)) {
                System.out.println(String.format("Result of the multiplication is: %s", result));
            } else {
                System.out.println(String.format("Result of the multiplication is: %s", -result));
            }

        } catch (InputMismatchException e) {
            System.out.println("Only integer numbers allowed. Please, try again.");
            main(args);
            System.exit(0);
        }

    }
}
