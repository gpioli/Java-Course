/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:

    La mayor ocurrencias es: 3
    El elemento que mas se repite es: 5

En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces
*  */

import java.util.Scanner;

public class T16_ArrayNumberOccurrences {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter a number between 1 and 9: ");
            int inputNumber = s.nextInt();

            if (inputNumber < 1 || inputNumber > 9) {
                System.out.println("The number you entered is out of the allowed range. Please enter another number: \n");
                i--;
            } else {
                a[i] = inputNumber;
            }
        }

        int numberWithMoreOccurrences = -1;
        int numberWithMoreOccurrencesRepetitions = 0;

        for (int i = 0; i < a.length; i++) {
            int auxConter = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == 0) {
                    continue;
                } else if (a[i] == a[j]) {
                    auxConter++;
                    if (auxConter > numberWithMoreOccurrencesRepetitions) {
                        numberWithMoreOccurrences = a[i];
                        numberWithMoreOccurrencesRepetitions = auxConter;
                    }
                }
            }
        }

        String message = (numberWithMoreOccurrences == - 1) ? ("There isn't a number" +
                " with more occurrences than the others." ) :
                (String.format("The number with more occurrences in the array is %s with " +
                        "%s occurrences.", numberWithMoreOccurrences, numberWithMoreOccurrencesRepetitions));

        System.out.println(message);
    }


}

