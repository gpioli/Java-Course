public class S12_005_BubbleOrderingOptimized {

    public static void main(String[] args) {


        String[] products = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung External Hard Drive", "Notebook Asus",
                "Macbook Air", "Chromecast 4th generation", "Oxford bicycle"};
        int total = products.length;

        // Here we use the bubble algorithm optimized.
        // We compare the actual element with the next

        // CompareTo method compares String using position in the unicode table.
        // less than 0 means it is in a previous position, and more than cero means
        int counter = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (products[j + 1].compareTo(products[j]) < 0) { // if i is in a lower value in the unicode table, we exchange the products.
                    String aux = products[j];
                    products[j] = products[j+1];
                    products[j+1] = aux;
                }
                counter++;
            }
        }
        System.out.println("counter = " + counter);

        System.out.println("\n=== Ordered array ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + products[i]);
        }

    }


}
