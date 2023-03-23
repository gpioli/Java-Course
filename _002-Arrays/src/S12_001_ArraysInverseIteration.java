import java.util.Arrays;

public class S12_001_ArraysInverseIteration {
    public static void main(String[] args) {

        // declaration and instantiation

/*        String[] products = new String[7];
        int total = products.length;*/

/*        products[0] = "Kingston Pendrive 64GB";
        products[1] = "Samsung Galaxy";
        products[2] = "Samsung External Hard Drive";
        products[3] = "Notebook Asus";
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4th generation";
        products[6] = "Oxford bicycle";*/


        String[] products = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung External Hard Drive", "Notebook Asus",
                "Macbook Air", "Chromecast 4th generation", "Oxford bicycle"};
        int total = products.length;

        Arrays.sort(products);
        System.out.println("\n=== Using for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + products[i]);
        }

        System.out.println("\n=== Using inverse for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index = " + (total-1-i) + ": " + products[total-1-i]);
        }

        System.out.println("\n=== Using inverse for 2===");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("Index = " + (i) + ": " + products[i]);
        }
    }
}
