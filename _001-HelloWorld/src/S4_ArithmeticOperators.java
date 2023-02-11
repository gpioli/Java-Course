import javax.swing.*;

public class S4_ArithmeticOperators {
    public static void main(String[] args) {

        // Asignation in the same line:
        int i = 5, j = 4, sum = i + j;

        System.out.println("sum = " + sum);

        System.out.println("i + j = " + i + j); // becareful with data types. In this case the result is the concatenation

        // we can fix this with parenthesis
        System.out.println("i + j = " + (i + j));

        int rest = i - j;
        System.out.println("rest = " + rest);
        //System.out.println("i - j = " + i - j); // this wont work because of string concatenation
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);

        float div = i/j;
        System.out.println("div = " + div); // we are losing .25, as the operation is made between ints
        div = (float) i / (float) j;
        System.out.println("div = " + div);
        
        int residual = 8 % 5;
        System.out.println("residual = " + residual);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        if (number % 2 == 0){
            JOptionPane.showMessageDialog(null,"Even number");
        } else {
            JOptionPane.showMessageDialog(null,"Odd number");
        }


    }
}
