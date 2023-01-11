public class X001_HelloWorld2 {
    public static void main(String[] args) {
        String salute = "Hello, my name is Gastón";
        System.out.println(salute);
        // concatenating text
        System.out.println("salute.toUpperCase() = " + salute.toUpperCase());

        // printing an int (primitive)
        int num = 10;
        System.out.println("num = " + num);

        // working with the boolean data type
        boolean value = true;

        if(value){
            System.out.println("It's true!");
        }

        // From JDK 10 we have available dynamic var assignation
        var numero3 = "15";
        System.out.println((numero3).getClass());

    }
}
