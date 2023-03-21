public class S10_001_MathClass {
    public static void main(String[] args) {

        int abs = Math.abs(-3);
        System.out.println("abs = " + abs);

        abs = Math.abs(3);
        System.out.println("abs = " + abs);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Rounding up
        double ceiling = Math.ceil(3.5);
        System.out.println("ceiling = " + ceiling);

        // Rounding down
        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);


        // Simple rounding
        long integ = Math.round(Math.PI);
        System.out.println("integ = " + integ);

        // exp

        double exp = Math.exp(1); // 1 to the 2.7182...
        System.out.println("exp = " + exp);

        double exp2 = Math.exp(2); // 1 to the 2.7182...
        System.out.println("exp2 = " + exp2);

        // log

        double log = Math.log(10);
        System.out.println("log = " + log);

        // pow -> power
        double pow = Math.pow(10,3);

        // root
        double root = Math.sqrt(5);
        System.out.println("root = " + root);

        // radians
        double degrees = Math.toDegrees(1.57);
        System.out.println("degrees = " + degrees);

        double radians = Math.toRadians(90.00);
        System.out.println("radians = " + radians);

        // sin, cos
        System.out.println("sin(90) = " + Math.sin(radians));
        System.out.println("cos(90) = " + Math.cos(radians));



    }
}
