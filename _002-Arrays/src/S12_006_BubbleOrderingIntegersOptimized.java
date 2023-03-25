public class S12_006_BubbleOrderingIntegersOptimized {

    public static void sortBubble(Object[] arr) {
        // CompareTo method compares String using position in the unicode table.
        // less than 0 means it is in a previous position, and more than cero means
        int counter = 0;
        int total = arr.length;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if( ((Comparable)(arr[j + 1])).compareTo(arr[j]) < 0) { // if i is in a lower value in the unicode table, we exchange the products.
                    Object aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }

    public static void main(String[] args) {


        Integer[] numbers = new Integer[4];
        int total = numbers.length;

        numbers[0] = 1;
        numbers[1] = Integer.valueOf(2); // Auto unboxing (from wrapper class to primitive)
        numbers[2] = 3;
        numbers[3] = -1;

        // Here we use the bubble algorithm optimized.
        // We compare the actual element with the next


        sortBubble(numbers);
        System.out.println("\n=== Ordered array ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Index " + i + " : " + numbers[i]);
        }

    }


}
