import java.util.Scanner;

public class S12_014_ArraysFindNumber {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please, enter a number");
            a[i] =  s.nextInt();
        }

        System.out.println("\r\nNow enter a number to search: ");
        int num = s.nextInt();

/*        int i = 0;
        while(i < a.length && a[i] != num) {
            i++;
        }
        if (i == a.length){
            System.out.println("Number not found in the array.");
        } else if (a[i] == num) {
            System.out.println("Number found in the " + i + " position.");
        }*/


        // it can be also be done with a for...
        int i = 0;
        for (; i < a.length && a[i] != num; i++) {}
        if (i == a.length){
            System.out.println("Number not found in the array.");
        } else if (a[i] == num) {
            System.out.println("Number found in the " + i + " position.");
        }

    }
}
