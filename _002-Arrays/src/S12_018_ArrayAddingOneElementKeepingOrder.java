import java.util.Scanner;

public class S12_018_ArrayAddingOneElementKeepingOrder {

    public static void main(String[] args) {

        // Here the idea is to have an array of size 10 with 9 elements, in order to be able to "move forward" the
        // elements that are after the new inserted one. But we need to keep the order in the array.
        // this only works for ordered arrays...

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Please, enter a number: ");
            a[i] = s.nextInt();
        }

        System.out.println("Please enter the number you want to add to the array: ");
        int elementToAdd = s.nextInt();

        int position = 0;
        while ((position < a.length) && (elementToAdd > a[position])) {
            position++;
        }


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
