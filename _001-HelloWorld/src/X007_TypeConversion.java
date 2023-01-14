public class X007_TypeConversion {
    public static void main(String[] args) {
        String strNumber = "50";
        
        int intNumber = Integer.parseInt(strNumber);
        System.out.println("intNumber = " + intNumber);

        String realStr = "98765.43";
        System.out.println("realStr = " + realStr + ". Tipo: " + realStr.getClass());
        String realStr2 = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        double realDouble2 = Double.parseDouble(realStr);
        System.out.println("realDouble2 = " + realDouble2);

        String boolStr = "TRue";
        boolean logicBool = Boolean.parseBoolean(boolStr);
        System.out.println("logicBool = " + logicBool); // notive it ignores case


        int otherIntNumber = 100;
        System.out.println("otherIntNumber = " + otherIntNumber);

        String otherStrNumber = Integer.toString(otherIntNumber);

        otherStrNumber = String.valueOf(otherStrNumber);
        System.out.println("otherStrNumber = " + otherStrNumber);

        double otherRealDouble = 1.23456;
        String otherRealStr = Double.toString(otherRealDouble);
        System.out.println("otherRealStr = " + otherRealStr);
        
        otherRealStr = String.valueOf(1.23456e2f);
        System.out.println("otherRealStr = " + otherRealStr);


        // Primitives conversion:

        int i = 32767;
        short s = (short)i; // here we will have data loss, as the value to cast is greater than the destination type
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);

    }
}
