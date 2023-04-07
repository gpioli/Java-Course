public class S13_004_MatrixFind {
    public static void main(String[] args) {

        int[][] intsMatrix = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementToFind = 32767;
        boolean found = false;
        int i;
        int j = 0;

        find:
        for (i = 0; i < intsMatrix.length; i++) {
            for (j = 0; j < intsMatrix[i].length; j++) {
                if (intsMatrix[i][j] == elementToFind) {
                    found = true;
                    break find; // we use a tag to break the first iteration
                }
            }
        }

        if (found) {
            System.out.println("Found " + elementToFind + " in the coordinates: " + i + "," + j + ".");
        } else {
            System.out.println(elementToFind + " was not found in the matrix.");
        }

    }
}
