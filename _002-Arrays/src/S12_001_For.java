import java.util.Arrays;

public class S12_001_For {
    public static void main(String[] args) {

        // declaration and instantiation

        String[] products = new String[7];
        int total = products.length;

        products[0] = "Kingston Pendrive 64GB";
        products[1] = "Samsung Galaxy";
        products[2] = "Samsung External Hard Drive";
        products[3] = "Notebook Asus";
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4th generation";
        products[6] = "Oxford bicycle";

        Arrays.sort(products);
        System.out.println("\n=== Using for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + products[i]);
        }

        System.out.println("\n=== Using foreach ===");
        for (String product: products) {
            System.out.println("Prod = " + product);
        }


        System.out.println("\n=== Using while ===");
        int i = 0;
        while (i < total){
            System.out.println("Index " + i + " : " + products[i]);
            i++;
        }

        int j = 0;
        System.out.println("\n=== Using do while ===");
        do {
            System.out.println("Index " + j + " : " + products[j]);
            j++;
        } while (j < total);




        int[] numbers = new int[10];
        int totalNumbers = numbers.length;

        for (int k = 0; k < totalNumbers; k++){
            numbers[k] = k * 3;
        }

        for (int k = 0; k < totalNumbers -1 ; k++) {
            System.out.println("Number " + k + ": " + numbers[k]);
        }



    }
}
