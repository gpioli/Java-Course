public class S6_003_WrapperRelationalOperators {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Same object? " + (num1 == num2)); // true (pointing to the same object)

        // Same value, but different instance:
        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Same object? " + (num1 == num2)); // false (pointing to different memory address)
        //(and we are comparing if the objects are the same)

        // We can compare the values with equals method:
        System.out.println("Same object? (Equals method) " + (num1.equals(num2))); //
        // Another way:
        System.out.println("Same object? (Explicit conversion to primitive method, so now we are comparing values): "
                + (num1.intValue() == num2.intValue())); // true


        // Exception
        // numbers lower than 128:
        num1 = 127;
        num2 = 127;

        // Java does automatically autounboxing and converts to primitive with values less or equal to 127
        System.out.println("Same object? (numbers less than 128)" + (num1 == num2)); // true (pointing to different memory address)
        
        
        // in this case there is no problem with using comparatives. The problem is only with the == operation
        num1 = 1000;
        num2 =  500;
        boolean condition = num1 > num2;
        System.out.println("condition = " + condition);
        
    }
}
