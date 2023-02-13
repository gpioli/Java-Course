import java.util.Scanner;

public class S4_008_TernaryOperator {
    public static void main(String[] args) {
        
        String variable = 7 == 7 ? "this will print if the confition is true" : "this will print if the condition is false";
        System.out.println("variable = " + variable);

        String state = "";
        double average = 0.0;

        double maths = 0.0;
        double science = 0.0;
        double history = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter maths note ranging from 2.0 - 7.0");
        maths = s.nextDouble();

        System.out.println("Please, enter science note ranging from 2.0 - 7.0");
        science = s.nextDouble();

        System.out.println("Please, enter history note ranging from 2.0 - 7.0");
        history = s.nextDouble();

        average = (maths + science + history) / 3;
        System.out.println("average = " + average);

        state = average >= 5.49 ? "Approved" : "Failed";
        System.out.println("state = " + state);
    }
}
