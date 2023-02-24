/*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        Podría ser utilizando operador ternario.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class T004_OrderedNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;

        System.out.println("Welcome! Please enter two numbers.");
        System.out.println("Enter the first number: ");

        try{
            a = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            b = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Only numbers allowed");
            main(args);
            System.exit(0);
        }

        System.out.println("Ordered numbers: ");
        String orderedNums = (a >= b) ? (String.valueOf(a) + " and " + String.valueOf(b)) : (String.valueOf(b) + "y " + String.valueOf(a));
        System.out.println(orderedNums);


    }
}
