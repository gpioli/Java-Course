public class S11_002_ArgsCommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please enter an operation (sum/subtraction/multiplication/division)" +
                    " and two integers\n");
        }

        String operation = args[0];
        int a = 0;
        int b = 0;
        double result = 0.00;

        try{
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Warning! the numbers from the input must be integers");
        }

        switch (operation) {
            case "sum":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                if (b == 0) {
                    System.out.println("Cero division is not allowed! ");
                    System.exit(-1);
                }
                result = (double)a/b;
                break;
            default:
                result = a+b;
        }

        System.out.println("Result of the operation is: " + result);

    }
}
