/*
* Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula)
* construida a base del numero 1 y utilizar el numero 0 como espacio. El tamaño de la silla se
* basa en una variable n que indicará el tamaño de la figura a imprimir en una matriz de n x n.

Por ejemplo para n=5 se obtiene:

    10000
    10000
    11111
    10001
    10001

Por ejemplo para n=6 se obtiene:

    100000
    100000
    100000
    111111
    100001
    100001

Por ejemplo para n=10 se obtiene:

    1000000000
    1000000000
    1000000000
    1000000000
    1000000000
    1111111111
    1000000001
    1000000001
    1000000001
    1000000001

Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
* */

import java.util.Scanner;

public class T19_ChariMatrix {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the size of the square matrix (n): ");
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("ERROR");
            System.exit(0);
        }

        String[][] matrix = new String[n][n];

        int counter = 0;
        int counter2 = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0 || (i == matrix.length / 2) || ((i > matrix.length / 2 ) && j == matrix.length - 1) ) {
                    matrix[i][j] = "1";

                } else {
                    matrix[i][j] = "0";
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
