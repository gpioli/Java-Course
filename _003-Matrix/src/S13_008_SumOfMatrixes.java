public class S13_008_SumOfMatrixes {
    public static void main(String[] args) {

        // in order to sum matrixes, they must be square matrixes


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

        int[][] b = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println();
        System.out.println("===Matrix b: ===");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }


        int [][] sum = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println();
        System.out.println("===Sum Matrix: ===");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
