import java.util.Scanner;

public class S12_019_ArrayDeletingAndMovingElements {
    public static void main(String[] args) {

        // Here the idea is to have an array of size 10 with 10 elements, and being able to receive an element
        // index to delete. Elements that are after the deleted one should move "down" into the array.


        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Please, enter a number: ");
            a[i] = s.nextInt();
        }

        System.out.println("Please enter the index of the element you want to remove from the array: ");
        int indexToDelete = s.nextInt();

        int position = 0;
/*        while ((position < a.length) && (indexToDelete > a[position])) {
            position++;
        }*/


        for (int i = indexToDelete; i <= a.length - 1; i++) {
            if (i == a.length - 1) {
                continue;
            } else {
                a[i] = a[i + 1];
            }
        }

        System.out.println("\nElements of the array are now:");
        int[] b = new int[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(" | " + b[i]);
        }

    }

}
