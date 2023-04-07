/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:

    La mayor ocurrencias es: 3
    El elemento que mas se repite es: 5

En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces
*  */

import java.util.Scanner;

public class T17_Histogram {
    public static void main(String[] args) {

        int[] a = new int[12];
        int[] histogram = {1, 2, 3, 4, 5, 6};
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter a number between 1 and 6: ");
            int inputNumber = s.nextInt();
            a[i] = inputNumber;
        }

        System.out.println("");

        for (int number: histogram) {
            System.out.print("\n" + number + ": ");
            for (int i = 0; i < a.length; i++) {
                if (a[i] == number) {
                    System.out.print("*");
                }
            }

        }
    }
}

