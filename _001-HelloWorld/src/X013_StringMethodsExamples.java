public class X013_StringMethodsExamples {
    public static void main(String[] args) {
        
        String name = "Gaston";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Gaston\") = " + name.equals("Gaston"));
        System.out.println("name.equals(\"Gaston\") = " + name.equals("gaston"));
        System.out.println("name.equalsIgnoreCase(\"gaston\") = " + name.equalsIgnoreCase("gaston"));
        System.out.println("name.compareTo(\"Gaston\") = " + name.compareTo("Gaston")); // compares two strings lexicografically
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(1) = " + name.charAt(1));
        System.out.println("name.charAt(5) = " + name.charAt(5));
        System.out.println("name.charAt(5) = " + name.charAt(name.length()-1));
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));
        System.out.println("name.substring(name.length()-3,name.length()) = " + name.substring(name.length()-3,name.length()));

    }
}
