public class S13_009_SumOfRowsColsMatrixes {
    public static void main(String[] args) {

        // We are only going to sum rows and columns
        int rowSum, colSum;

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println();
        System.out.println("===Matrix a: ===");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }


        for (int i = 0; i < a.length; i++) {
            rowSum = 0;
            colSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
                // sum cols is equal to the transposed
                colSum += a[j][i];
            }
            System.out.println("Total row " + i + ": " + rowSum);
            System.out.println("Total col " + i + ": " + colSum);
        }

    }
}
