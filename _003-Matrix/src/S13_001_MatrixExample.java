public class S13_001_MatrixExample {
    public static void main(String[] args) {

        int[][] numbers = new int[2][4];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        numbers[1][0] = 11;
        numbers[1][1] = 12;
        numbers[1][2] = 13;
        numbers[1][3] = 14;

        // Number of rows:
        System.out.println("Number of rows: " + numbers.length);
        //Number of columns:
        System.out.println("Number of columns: " + numbers[0].length);

        System.out.println("First element of the matrix: " + numbers[0][0]);
        System.out.println("Last element of the matrix: " + numbers[numbers.length - 1][numbers[1].length - 1]);

        int num1 = numbers[0][0];
        int num2 = numbers[0][1];
        int num3 = numbers[0][2];
        int num4 = numbers[0][3];

        int num5 = numbers[1][0];
        int num6 = numbers[1][1];
        int num7 = numbers[1][2];
        int num8 = numbers[1][3];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);

    }
}
