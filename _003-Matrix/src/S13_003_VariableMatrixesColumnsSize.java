public class S13_003_VariableMatrixesColumnsSize {
    public static void main(String[] args) {

        int[][] matrix = new int[3][];

        // Creating different columns size:

        matrix[0] = new int[2];
        matrix[1] = new int[3];
        matrix[2] = new int[4];

        System.out.println("Matrix length: " + matrix.length);
        System.out.println("Row 0 length: " + matrix[0].length);
        System.out.println("Row 1 length: " + matrix[1].length);
        System.out.println("Row 2 length: " + matrix[2].length);

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
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
