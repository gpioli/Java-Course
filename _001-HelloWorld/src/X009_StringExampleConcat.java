public class X009_StringExampleConcat {
    public static void main(String[] args) {
        String course = "Java programming"; // String is a special type: its an object but we can write directly
        String professor = "Andrés Guzman";

        String detail = course + " with the instructor " + professor;
        System.out.println( detail);
        // Java programming with the instructor Andrés Guzman

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + numberA + numberB);
        /*
         Java programming with the instructor Andrés Guzman105
         what happens here is that first the compiler evaluates the first variable, and as it is a string,
         it concatenates everything after
         we can solve this with parenthesis
         IMPORTANT HERE: parenthesis and precedence
        */

        System.out.println(detail + (numberA + numberB));

        String detail2 = course.concat(" with ".concat(professor)); // this is more efficient than concatenating with "+"
        System.out.println("detail2 = " + detail2);

    }
}
