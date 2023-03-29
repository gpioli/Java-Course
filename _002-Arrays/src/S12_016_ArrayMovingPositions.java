import java.util.Scanner;

public class S12_016_ArrayMovingPositions {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Please, enter a number: ");
            a[i] = s.nextInt();
        }

        int last = a[a.length - 1];
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                a[i] = last;
            } else {
                a[i] = a[i-1];
            }
        }

        System.out.println("\nElements of the array 'a' are now:");
        for (int i=0; i < a.length; i++) {
            System.out.print(" | " + a[i]);
        }

    }
}
