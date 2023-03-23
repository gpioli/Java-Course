public class S11_002_ArgsCommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please enter an operation (sum/substraction/multiplication/division)" +
                    " and two integers\n");
        }

        String operation = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double result = 0.00;

        switch (operation) {
            case "sum":
                result = a + b;
                break;
            case "substraction":
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
