import java.util.Scanner;

public class S12_010_ArraysGreaterNum {
    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter 5 integers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int max = 0;
        for (int i = 0; i < a.length; i++){
            max = (a[max] > a[i] ? max : i );
        }

        System.out.println("Max value of the array: " + a[max]);
    }
}
