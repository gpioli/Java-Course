/*
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
el promedio de los negativos y contar el número de ceros.
*  */

import java.util.Scanner;

public class T15_StatisticSystem {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        int positivesRunningTotal = 0;
        int totalPositives = 0;
        Double positivesMean = 0d;

        int negativesRunningTotal = 0;
        int totalNegatives = 0;
        Double negativesMean = 0d;

        int totalCeros = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter a number: ");
            a[i] = s.nextInt();
        }


        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positivesRunningTotal += a[i];
                totalPositives++;
            } else if (a[i] < 0) {
                negativesRunningTotal += a[i];
                totalNegatives++;
            } else if (a[i] == 0) {
                totalCeros++;
            }
        }

        try {
            positivesMean = ( Double.valueOf(positivesRunningTotal) / Double.valueOf(totalPositives));
        } catch (ArithmeticException e) {
            positivesMean = 0d;
        }

        try {
            negativesMean = ( Double.valueOf(positivesRunningTotal) / Double.valueOf(totalNegatives));
        } catch (ArithmeticException e) {
            negativesMean = 0d;
        }


        System.out.println("Total positive numbers: " + totalPositives);
        System.out.println("Positive numbers mean: " + positivesMean);
        System.out.println("Total negative numbers: " + totalNegatives);
        System.out.println("Negative numbers mean: " + negativesMean);
        System.out.println("Total cero numbers: " + totalCeros);
    }


}

