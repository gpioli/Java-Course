import java.util.Arrays;
import java.util.Collections;

public class S12_004_ArraysInverseIterationMuting {

    public static void inverseArray(String[] arr) {

        int total2 = arr.length;
        int total = arr.length;
        for (int i = 0; i < total2; i++) {
            String actual = arr[i];
            String inverse = arr[total-1-i];
            arr[i] = inverse;
            arr[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {




        String[] products = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung External Hard Drive", "Notebook Asus",
                "Macbook Air", "Chromecast 4th generation", "Oxford bicycle"};
        int total = products.length;

        Arrays.sort(products);
        System.out.println("\n=== Using for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + products[i]);
        }


        inverseArray(products);
        System.out.println("\n=== Inverse array ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + products[i]);
        }


        // Another way: Api Collections:
        System.out.println("\n=== Collections API - lets invert it again: ===");
        Collections.reverse(Arrays.asList(products));
        System.out.println("\n=== Inverse array ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + products[i]);
        }

    }
}
