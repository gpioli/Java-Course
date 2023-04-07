public class S13_005_SymmetricMatrix {
    public static void main(String[] args) {

        // working with symmetric matrix r1 = c1, r2 = c2, r3 = c3
        boolean symmetric = true;

        int[][] matrix = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        int i, j;
        i = 0;
        firstWhile:
        while (i < matrix.length && symmetric) {
            j = 0;
            // we could evaluate all the "cells" in the matrix, but in order to optimize we will only evaluate the
            // minimum neccesary with the condition j<i
            while (j < i && symmetric) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break firstWhile;
                }
                j++;
            }
            i++;
        }

        if (symmetric) {
            System.out.println("Matrix is symmetric. ");
        } else {
            System.out.println("Matrix is not symmetric");
        }

    }
}
