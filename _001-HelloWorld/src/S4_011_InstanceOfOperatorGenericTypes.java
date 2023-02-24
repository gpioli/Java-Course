public class S4_011_InstanceOfOperatorGenericTypes {
    public static void main(String[] args) {

        Object text = "Creating an object of String class... what's up!";

        Number num = Integer.valueOf(7); //7; this way is valid, but on the left is the correct form

        boolean b1 = text instanceof String;
        System.out.println("text is of String type: = " + b1);

        boolean b2 = text instanceof Object; // All classes inherit from the Object class
        System.out.println("text is of Object type = " + b2);

        boolean b11 = text instanceof Integer;
        System.out.println("text is of Integer type = " + b11);

        boolean b3 = num instanceof Integer;
        System.out.println("num is of Integer type = " + b3);

        boolean b4 = num instanceof Number;
        System.out.println("num is of Integer type = " + b4);

        boolean b33 = num instanceof Object;
        System.out.println("num is of Object type = " + b33);

        boolean b34 = num instanceof Long;
        System.out.println("num is of Long type = " + b33);

        boolean b35 = num instanceof Double;
        System.out.println("num is of Double type = " + b33);
        
        Number dec = Double.valueOf(45.54) ;
        boolean b5 = dec instanceof Double;
        System.out.println("dec is of Double type = " + b5);

        boolean b6 = dec instanceof Double;
        System.out.println("dec is of Double type = " + b5);

        boolean b7 = dec instanceof Number;
        System.out.println("dec is of Number type = " + b5);

    }

}
