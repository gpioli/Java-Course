public class S4_010_InstanceOfOperator {
    public static void main(String[] args) {

        String text = "Creating an object of String class... what's up!";

        Integer num = 7;

        boolean b1 = text instanceof String;
        System.out.println("text is of String type: = " + b1);

        boolean b2 = text instanceof Object; // All classes inherit from the Object class
        System.out.println("text is of Object type = " + b2);

        boolean b3 = num instanceof Integer;
        System.out.println("num is of Integer type = " + b3);

        boolean b4 = num instanceof Number;
        System.out.println("num is of Integer type = " + b4);
        
        Double dec = 45.54;
        boolean b5 = dec instanceof Number;

        System.out.println("b5 = " + b5);

    }

}
