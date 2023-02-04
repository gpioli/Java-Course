public class X009_StringExampleInmutability {
    public static void main(String[] args) {
        String course = "Java programming"; // String is a special type: its an object but we can write directly
        String professor = "Andrés Guzman";
        
        // We work with inmutability, learning that strings are inmutable

        course.concat(professor); // this concatenates in the object *course*
        System.out.println("course = " + course); // but as it is a String and its inmutable, nothing will change

        // lets create an object
        String result = course.concat(professor);
        System.out.println("result = " + result);
        System.out.println(course == result); // these are two distinct objects

        // lambda: | transform method comes with java12+
//        String result2 = course.transform(c -> {
//            return c + " with " + professor;
//        });

        result.replace("a", "A");
        System.out.println("result: " + result); // NOTHING CHANGED!

        String result3 = result.replace("a", "A"); // here we DO see changes, as they are saved
        // into a new object
        System.out.println("result3 = " + result3);

    }
}
