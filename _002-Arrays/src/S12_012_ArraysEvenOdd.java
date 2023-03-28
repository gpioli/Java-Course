import java.util.Scanner;

public class S12_012_ArraysEvenOdd {

    public static void main(String[] args) {

        int[] a, even, odd;
        int totalEven = 0;
        int totalOdd = 0;
        a = new int[10];

        System.out.println("Please enter 10 numbers:");
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalEven++;
            } else {
                totalOdd++;
            }
        }

        even = new int[totalEven];
        odd = new int[totalOdd];

        int j = 0;
        int k = 0;

        for (int value : a) {
            if (value % 2 == 0) {
                even[j++] = value;
            } else {
                odd[k++] = value;
            }
        }

        System.out.println("===Even numbers: ===");
        for (int value : even){
            System.out.println(value);
        }

        System.out.println("\n=== Odd numbers: ===");
        for (int value : odd) {
            System.out.println(value);
        }

    }
}
