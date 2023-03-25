public class S12_007_OrderingArraysStartEnd {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        // We want to print the numbers of an array by pairs, of the first and last elements, second and n-1...

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

        }

        for (int i = 0; i < numbers.length - i; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println(numbers[numbers.length - 1 - i]);
        }

        // now we want to populate a new array in the order previously shown:
        int[] a = new int[10];
        int aux = 0;
        for (int i = 0; i < numbers.length - i; i++) {
            a[aux++] = numbers[i];
            a[aux++] = (numbers[numbers.length - 1 - i]);
        }

        // now we wanna show the data:
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + ". value " + a[i]);
        }

    }
}
