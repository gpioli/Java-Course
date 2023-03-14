public class S7_001_PassByValue {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("We start main with i = " + i);
        test(i);
        System.out.println("The main method ends with the i value = " + i + " (it stays the same)");
    }

    // We create another method

    public static void test(int i){
        System.out.println("We start the test method with i =  " + i);
        i = 35;
        System.out.println("The test method ends with a new i value = " + i);
    }

    // This is because the Integer, String, Double, and all the Wrapper classes are inmutable
    // This happens despite passing values by value or by reference
}
