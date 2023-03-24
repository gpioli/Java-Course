import java.util.Arrays;
import java.util.Collections;

public class S12_005_BubbleOrdering {

    public static void inverseArray(String[] arr) {

        int total2 = arr.length;
        int total = arr.length;
        for (int i = 0; i < total2; i++) {
            String actual = arr[i];
            String inverse = arr[total - 1 - i];
            arr[i] = inverse;
            arr[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {



        String[] products = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung External Hard Drive", "Notebook Asus",
                "Macbook Air", "Chromecast 4th generation", "Oxford bicycle"};
        int total = products.length;

        // Here we use the bubble algorithm. It's not very efficient but it works

        // CompareTo method compares String using position in the unicode table.
        // less than 0 means it is in a previous position, and more than cero means
        int counter = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (products[i].compareTo(products[j]) < 0) { // if i is in a lower value in the unicode table, we exchange the products.
                    String aux = products[i];
                    products[i] = products[j];
                    products[j] = aux;
                    counter++;
                }
            }
        }

        System.out.println("\n=== Ordered array ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + products[i]);
        }

    }


}
