public class X003_FloatPrimitives {

    static float floatVar2;
    // wait till the end to see why we declare this var

    public static void main(String[] args) {

        // Float primitives

        float realFloat = 1;
        System.out.println("realFloat = " + realFloat);
        // float realFloat2 = 1.0 // this wont work, as java interpretes this as a double, we must specify its a float
        float realFloat2 = 1.0f;
        System.out.println("realFloat2 = " + realFloat);
        float realFloat3 = 2.12e3f;
        System.out.println("realfloat3 = " + realFloat3);
        float realFloat4 = 1.5e-10f;
        System.out.println("realFloat4 = " + realFloat4);


        // Constants of the float wrapper class (Float)
        System.out.println("");

        float new_realFloat = 0.0000000015f; // max value || If we exceed this value, the number may truncate, so there will be
        // data loss
        System.out.println("new_realFloat = " + new_realFloat);
        System.out.println("float type corresponds in bytes to " + Float.BYTES); // notice we are using a wrapper to know
        // more information about float. Wrapp
        System.out.println("float type corresponds in bites to " + Float.SIZE);
        System.out.println("float value of a int: " + Float.MAX_VALUE);
        System.out.println("float value of a int: " + Float.MIN_VALUE);

        System.out.println("");

        // Constants of the double wrapper class (Double)
        System.out.println("");

        double realDouble = 3.4028235E38; // pay attention that, by simply inputing the ".", java recognizes this is a D
        // double
        System.out.println("realDouble = " + realDouble);
        System.out.println("double type corresponds in bytes to " + Double.BYTES); // notice we are using a wrapper to know
        // more information about float. Wrapp
        System.out.println("double type corresponds in bites to " + Double.SIZE);
        System.out.println("double value of a int: " + Double.MAX_VALUE);
        System.out.println("double value of a int: " + Double.MIN_VALUE);

        System.out.println("");

        var floatVar = 3.1416; // this will be a double
        System.out.println(floatVar);
        var doubleVar = 3.1416f; // this will be a float
        System.out.println("floatVar: " + doubleVar);
        var intVar = 3; // this will be an int
        System.out.println("floatVar: " + intVar);

        // the default value will be 0 for all this primitives but :
        // this wont work, because the attribute or class variable is local // float floatVar2;
        // ir order to use it, it must be static (a variable of the class -> see the new declaration at the top)
        // static will mean that the var is shared among all the instances of a class and not to a particular object
        System.out.println("floatVar2 = " + floatVar2);

    }
}
