import java.util.Arrays;

public class S12_001_Arrays {
    public static void main(String[] args) {

        // declaration and instantiation
        int[] numbers = new int[4];

        String[] products = new String[7];

        // initializing values
        numbers[0] = 1;
        numbers[1] = Integer.valueOf(2); // Auto unboxing (from wrapper class to primitive)
        numbers[2] = 3;
        numbers[3] = -1;
        // numbers[4] = 5; //compiler will allow this, but it will break in execution time (indexOutOfBoundException)

        products[0] = "Kingston Pendrive 64GB";
        products[1] = "Samsung Galaxy";
        products[2] = "Samsung External Hard Drive";
        products[3] = "Notebook Asus";
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4th generation";
        products[6] = "Oxford bicycle";


        // accessing data:
        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[numbers.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String prod0 = products[0];
        String prod1 = products[1];
        String prod2 = products[2];
        String prod3 = products[3];
        String prod4 = products[4];
        String prod5 = products[5];
        String prod6 = products[6];

        System.out.println("\nBefore sorting: ");
        System.out.println("prod0 = " + prod0);
        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);

        // sorting:
        Arrays.sort(products);

        prod0 = products[0];
        prod1 = products[1];
        prod2 = products[2];
        prod3 = products[3];
        prod4 = products[4];
        prod5 = products[5];
        prod6 = products[6];

        System.out.println("\nSorted:");

        System.out.println("prod0 = " + prod0);
        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);


        Integer[] arr = {0, 8, -10, 45, 100, -50};
        System.out.println("\nUnordered number array elements: ");
        Arrays.stream(arr).forEach(c -> System.out.println(c));
        Arrays.sort(arr);
        System.out.println("\nOrdered number array elements: ");
        Arrays.stream(arr).forEach(System.out::println); // this does the same as the previous stream

    }
}
