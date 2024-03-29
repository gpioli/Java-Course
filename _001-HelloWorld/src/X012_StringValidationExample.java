public class X012_StringValidationExample {
    public static void main(String[] args) {

        String course = null;
        
        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);


        // We can prevent an error generated by a null value by the following way:
        if(isNull == false){
            System.out.println(course.toUpperCase());
        }
        //System.out.println("Welcome to the course ".concat(course)); // this will break
        System.out.println("Welcome to the course " + course); // this wont break, but will print 'null'

        // Validating that the string isn't null and isn't empty:

        if(isNull){
            course = "Java programming";
        }

        // Validating that the string isn't null and isn't empty:

        boolean isEmpty = course.length() == 0;
        if(!isEmpty){
            System.out.println("Welcome to the course " + course);
        }

        // There already exist a method for this:

        if(!course.isEmpty() & !course.isBlank()){
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to the course ".concat(course));
        }


    }

}
