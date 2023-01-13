public class X005_BoolPrimitives {
    public static void main(String[] args) {
        
        boolean logicDate = false;
        System.out.println("logicDate = " + logicDate);
        System.out.println(Boolean.FALSE); // this is the same as writting the constant of the Boolean class
        // the difference is that this returns an instance of the class
        // there's an implicit conversion here, from Boolean -> boolean

        double d = 98765.43e-3; // 98.76543 (real value)
        System.out.println("d = " + d);
        float f = 1.2345e2f; //  123.45 (real value)
        System.out.println("f = " + f);

        logicDate = d > f;
        System.out.println("logicDate = " + logicDate);
        
        boolean isEqual = (3-2 == 1);
        System.out.println("isEqual = " + isEqual);

    }
}
