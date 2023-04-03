/*
* Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), por ejemplo
* {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
*  */

import java.util.Scanner;

public class T14_MaxNumberOfTheArray {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter a number between 11 and 99: ");
            int inputNumber = s.nextInt();

            if (inputNumber < 11 || inputNumber > 99) {
                System.out.println("The number you entered is out of the allowed range. Please enter another number: \n");
                i--;
            } else {
                a[i] = inputNumber;
            }
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Maximum number of the array is: " + max);



    }
}
