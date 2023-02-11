public class S4_004_IncrementalOperators {
    public static void main(String[] args) {

        // Pre increment
        int i = 1;
        int j = ++i; // i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pos increment
        i = 2;
        System.out.println("Initial i = " + i);
        j = i++; // i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decrement

        i = 3;
        j = --i; // i = i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pos decrement

        i = 4;
        j = i--; 
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Becareful with this: value printed is not the final value for the second example
        System.out.println("(++j) = " + (++j));
        System.out.println("j++ = " + j++);

        System.out.println("Final value of j = " + j);

    }
}
