import java.util.Scanner;

public class S12_017_ArrayAddingOneElement {
    public static void main(String[] args) {

        // Here the idea is to have an array of size 10 with 9 elements, in order to be able to "move forward" the
        // elements that are after the new inserted one

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Please, enter a number: ");
            a[i] = s.nextInt();
        }

        System.out.println("Please enter the number you want to add to the array: ");
        int elementToAdd = s.nextInt();

        System.out.println("Please enter the position where you want to add the number (0 to 9): ");
        int position = s.nextInt();

        int last = a[a.length - 1];
        for (int i = a.length - 1; i >= position; i--) {
            if (i == position) {
                a[i] = elementToAdd;
            } else {
                a[i] = a[i - 1];
            }
        }

        System.out.println("\nElements of the array 'a' are now:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" | " + a[i]);
        }

    }

}
