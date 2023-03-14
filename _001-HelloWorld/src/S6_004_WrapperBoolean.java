public class S6_004_WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        // primitive vs reference:
        boolean primBoolean = num1 > num2;
        Boolean booleanObj = Boolean.valueOf(primBoolean);
        Boolean booleanObj2 = Boolean.valueOf("false");
        Boolean booleanObj3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("booleanObj = " + booleanObj);
        System.out.println("booleanObj2 = " + booleanObj2);

        // Boolean doesn't behave same way than Integers!
        System.out.println("Comparing two boolean objects: " + (booleanObj == booleanObj2)); // true
        System.out.println("Comparing two boolean objects: " + (booleanObj.equals(booleanObj2))); // true

        System.out.println("Comparing two boolean objects: " + (booleanObj2 == booleanObj3)); // true
        System.out.println("Comparing two boolean objects: " + (booleanObj.equals(booleanObj3))); // true

        
        // Going the other way (Reference type to primitive)
        boolean primBoolean2 = booleanObj2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
        
    }
}
