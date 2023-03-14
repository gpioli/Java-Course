public class S6_001_WrapperInteger {
    public static void main(String[] args) {

        //Integer intObject = new Integer(32768); // This is deprecated

        // We should create it this way (explicit or boxing)
        int intPrimitive = 32768;
        Integer intObject = Integer.valueOf(intPrimitive);

        // Or with "autoboxing":
        Integer intObject2 = 32768;

        // Asigning the primitive integer:
        // implicit
        int num = intObject;

        // explicit:
        int num2 = intObject2.intValue();

        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String valueLCDTv = "67000";
        Integer value = Integer.valueOf(valueLCDTv);
        System.out.println("value = " + value);

        // Here we have loss of information
        Short shortObject = intObject.shortValue();
        System.out.println("shortObject = " + shortObject);

        // Remember the max is 127, so here we will have information loss:
        Byte byteObject = intObject.byteValue();
        System.out.println("byteObject = " + byteObject);

        // On the other side, there's no problem with this:
        Long longObject = intObject.longValue();
        System.out.println("longObject = " + longObject);

    }
}
