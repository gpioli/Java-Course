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
        
    }
}
