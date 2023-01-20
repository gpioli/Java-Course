public class X008_StringExample {
    public static void main(String[] args) {
        String course = "Java programming"; // String is a special type: its an object but we can write directly
        // values, without having to instantiate it (it was decided in the first versions of Java because of its
        // usability
        String course2 = new String("Java programming");
        // but they're different objects - different instances: one is created in implicit way and the other one
        // explicitly

        // 1 - Comparing strings
        // this compares the reference, and it wont be what we will usually want
        boolean isEqual = course == course2;
        System.out.println("1 - course == course2 = " + isEqual);

        // This is the best to compare String values
        isEqual = course.equals(course2);
        System.out.println("2 - course.equals(course2) = " + isEqual);

        course2 = "Java Programming";
        isEqual = course.equals(course2);
        System.out.println("3 - course.equals(course2) = " + isEqual);
        boolean isEqualIgnoreCase = course.equalsIgnoreCase(course2);
        System.out.println("4 - isEqualIgnoreCase = " + isEqualIgnoreCase);

        // why this is true?
        String course3 = "Java programming";
        isEqual = course == course3;
        System.out.println("course == course3 = " + course3);
        // when we create an object String in the literal, and then we create a new object, what Java does is, in order
        // to optimize, assign the same memory reference
        
    }
}
