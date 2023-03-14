import java.lang.reflect.Method;

public class S6_005_ExampleMethodGetClass {
    public static void main(String[] args) {

        String text = "Whazaaap!";

        Class strClass = text.getClass();

        // This shows the complete name of the class, incluiding the package
        System.out.println("strClass.getName() = " + strClass.getName());
        // Without package
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        // Package name
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        // Complete name, incluiding the word class (its an instance of the Class class)
        System.out.println("strClass.getName() = " + strClass);

        // this will list all of the methods of the String class
        for(Method m: strClass.getMethods()){
            System.out.println("method.getName() = " + m.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("objClass = " + objClass);
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());

    }

}
