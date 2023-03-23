public class S12_001_Arrays {
    public static void main(String[] args) {

        // declaration and instantiation
        int[] numbers = new int[4];

        // initializing values
        numbers[0] = 1;
        numbers[1] = Integer.valueOf(2); // Auto unboxing (from wrapper class to primitive)
        numbers[2] = 3;
        numbers[3] = 4;
        // numbers[4] = 5; //compiler will allow this, but it will break in execution time (indexOutOfBoundException)

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[numbers.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
