/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la
clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces
(ingresado) para pedir el numero entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir
" el numero menor es igual o mayor que 10!".*/


import javax.print.DocFlavor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class T007_FindMin {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome! How many numbers would you like to compare? Minimum value " +
                "accepted is 10 (Enter the number, i.e.: 10)");
        try {

            int numToCompare = s.nextInt();
            if (numToCompare < 10) {
                System.out.println("You entered a value smaller than 10. Please, try again \n");
                main(args);
                System.exit(0);
            }

            int minNum = 0;
            for (int i = 0; i < numToCompare; i++){
                System.out.println(String.format("Enter the integer #%s: ", i));
                int j = s.nextInt();
                if (i == 0 || j < minNum) {
                    minNum = j;
                }
            }
            System.out.println(String.format("The minimum number is %s:", minNum));
            if (minNum < 10){
                System.out.println("The minimum number is smaller than 10!");
            } else {
                System.out.println("The minimum number si equal to or greater than 10!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Unsupported input. Please enter the number of integers to compare, and then, one by one" +
                    "the integers. ");
        }



    }

}
