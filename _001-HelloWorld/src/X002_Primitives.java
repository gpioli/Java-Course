import java.sql.SQLOutput;

public class X002_Primitives {
    public static void main(String[] args) {

        byte byteNumber = 7; // max value: -127 y 127
        //byte byteNumber2 = 128; // This wont work, because 128 is an int but not a byte
        System.out.println("byteNumber = " + byteNumber);
        System.out.println("byte type corresponds in byte to " + Byte.BYTES); // 127
        System.out.println("Byte type corresponds in bites to " + Byte.SIZE); // -128
        System.out.println("Max value of a byte: " + Byte.MAX_VALUE);
        System.out.println("Min value of a byte: " + Byte.MIN_VALUE);

        System.out.println("");

        short shortNumber = 32767; // max value || If we exceed this value, the number may truncate, so there will be
        // data loss
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("short type corresponds in byte to " + Short.BYTES);
        System.out.println("short type corresponds in bites to " + Short.SIZE);
        System.out.println("Max value of a short: " + Short.MAX_VALUE);
        System.out.println("Min value of a short: " + Short.MIN_VALUE);

        System.out.println("");

        int intNumber = 2147483647; // max value || If we exceed this value, the number may truncate, so there will be
        // data loss
        System.out.println("intNumber = " + intNumber);
        System.out.println("int type corresponds in byte to " + Integer.BYTES); // notice we are using a wrapper to know
        // more information about primitives. Wrapp
        System.out.println("int type corresponds in bites to " + Integer.SIZE);
        System.out.println("Max value of a int: " + Integer.MAX_VALUE);
        System.out.println("Min value of a int: " + Integer.MIN_VALUE);

        System.out.println("");

        long longNumber = 2147483648L; // max value || If we exceed this value, the number may truncate, so there will be
        // data loss
        System.out.println("longNumber = " + longNumber);
        System.out.println("long type corresponds in byte to " + Long.BYTES); // notice we are using a wrapper to know
        // more information about primitives. Wrapp
        System.out.println("long type corresponds in bites to " + Long.SIZE);
        System.out.println("long value of a int: " + Long.MAX_VALUE);
        System.out.println("long value of a int: " + Long.MIN_VALUE);

        System.out.println("");

        var varNumber = 127;
    }
    
}
