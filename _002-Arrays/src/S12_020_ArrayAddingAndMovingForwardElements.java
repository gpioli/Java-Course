import java.util.Scanner;

public class S12_020_ArrayAddingAndMovingForwardElements {
    public static void main(String[] args) {


        // Here the idea is to have an array of size 10, and allow the user to add an element,
        // in a determined position and "move forward" the elements that are after the new inserted one.
        // The final array will have all the elements and the new one, so its length will be original_length+1

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Please, enter a number: ");
            a[i] = s.nextInt();
        }

        System.out.println("Please enter the number you want to add to the array: ");
        int elementToAdd = s.nextInt();

        System.out.println("Please enter the position where you want to add the number (0 to 9): ");
        int position = s.nextInt();


        for (int i = a.length - 1; i >= position; i--) {
            if (i == position) {
                a[i] = elementToAdd;
            } else {
                a[i] = a[i - 1];
            }
        }

        int last = a[a.length - 1];
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[position] = elementToAdd;
        b[b.length - 1] = last;

        System.out.println("\nElements of the array 'a' are now:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" | " + b[i]);
        }

    }

}

