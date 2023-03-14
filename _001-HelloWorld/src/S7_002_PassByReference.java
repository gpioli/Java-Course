public class S7_002_PassByReference {
    public static void main(String[] args) {

        // Arrays are mutable objects, the

        int[] age = {10, 11, 12};

        System.out.println("We start main method");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Before calling test method.");
        test(age);
        System.out.println("After calling the test method.");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("The main method ends with the i value modified");
    }

    // We create another method

    public static void test(int[] ageArr){
        System.out.println("We start the test method with i");
        for (int i = 0; i < ageArr.length; i++) {
            ageArr[i] = ageArr[i] + 20;
        }
        System.out.println("The test method ends");
    }

    // This is because the Integer, String, Double, and all the Wrapper classes are inmutable
    // This happens despite passing values by value or by reference
}
