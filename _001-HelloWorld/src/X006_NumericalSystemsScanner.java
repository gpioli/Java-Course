import javax.swing.*;

public class X006_NumericalSystemsScanner {
    public static void main(String[] args) {

        String strNumber = JOptionPane.showInputDialog(null, "Please, enter an Integer number");

        int decNumber = 0;
        try {
            decNumber = Integer.parseInt(strNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: only Integer numers are accepted");
            main(args); // if the error happens, the idea is to repeat the process
            System.exit(0);
        }

        System.out.println("decNumber = " + decNumber);

        String binaryMessage = "binary number of " + decNumber + " = " + Integer.toBinaryString(decNumber);
        System.out.println(binaryMessage);
        
        int binaryNumber = 0b111110100; // 0b indicates java that the number is binary
        // when we print it java will print it as dec
        System.out.println("binaryNumber = " + binaryNumber);

        String octalMessage = "octal number of " + decNumber + " = " + Integer.toOctalString(decNumber);
        System.out.println(octalMessage);
        int octalNumber = 0764; // the 0 indicates java its in Octal system

        String hexadecimalMessage = "hexadecimal number of " + decNumber + " = " + Integer.toHexString(decNumber);
        System.out.println(hexadecimalMessage);
        int hexNumber = 0x1f4; // the 0 indicates java its in Octal system

        String message = "Binary number of " + decNumber + " = " + Integer.toBinaryString(decNumber);
        message += "\n octal number of " + decNumber + " = " + Integer.toOctalString(decNumber);
        message += "\n hexadecimal number of " + decNumber + " = " + Integer.toHexString(decNumber);
        JOptionPane.showMessageDialog(null, message);
    }
}
