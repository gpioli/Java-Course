import java.util.Scanner;

public class S12_015_ArraysFindString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please, enter a word");
            a[i] =  s.next();
        }

        System.out.println("\r\nNow enter a word to search: ");
        String word = s.next();

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
        for (; i < a.length && !a[i].equalsIgnoreCase(word); i++) {}
        if (i == a.length){
            System.out.println("\nWord not found in the array.");
        } else if (a[i].toLowerCase().compareTo(word.toLowerCase()) == 0) {
            System.out.println("\nWord found in the " + i + " position.");
        }

    }
}
