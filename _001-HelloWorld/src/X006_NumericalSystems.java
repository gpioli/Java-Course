public class X006_NumericalSystems {
    public static void main(String[] args) {

        int decNumber = 500;
        System.out.println("decNumber = " + decNumber);

        System.out.println("binary number of " + decNumber + " = " + Integer.toBinaryString(decNumber));
        
        int binaryNumber = 0b111110100; // 0b indicates java that the number is binary
        // when we print it java will print it as dec
        System.out.println("binaryNumber = " + binaryNumber);

        System.out.println("octal number of " + binaryNumber + " = " + Integer.toOctalString(binaryNumber));
        int octalNumber = 0764; // the 0 indicates java its in Octal system

        System.out.println("hexadecimal number of " + binaryNumber + " = " + Integer.toHexString(binaryNumber));
        int hexNumber = 0x1f4; // the 0 indicates java its in Octal system
    }
}
