import java.util.Scanner;

public class S12_011_ArraysFindOrder {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter 7 numbers");

        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        boolean descendant = false;
        boolean ascendant = false;
        for(int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descendant = true;
            } else if (a[i] < a[i + 1]) {
                ascendant = true;
            }
        }

        if (ascendant && !descendant) {
            System.out.println("Ascendant array.");
        } else if (descendant && !ascendant) {
            System.out.println("Descendant array.");
        } else {
            System.out.println("Disordered array.");
        }


    }
}
