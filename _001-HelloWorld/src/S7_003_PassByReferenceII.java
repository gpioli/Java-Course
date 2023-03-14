
// It is always recommended to create a new class in a new file, but for this example it will be ok
class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    // This would be ambigous, but if the variable received by the method has a different name than the attribute,
    // there's no need to use *this.*
//    public void setName(String name) {
//        name = name;
//    }

    public String getName() {
        return name;
    }
}

public class S7_003_PassByReferenceII {

// Here we see the concept of passing by reference

    public static void main(String[] args) {


        Person person = new Person();
        person.setName("Andrew");

        System.out.println("We start main method");
        System.out.println("person = " + person.getName());
        System.out.println("Before calling test method.");
        test(person);
        System.out.println("After calling the test method.");
        System.out.println("person.getName() = " + person.getName());
        System.out.println("The main method ends with the i value modified");
    }

    // We create another method

    public static void test(Person person){
        System.out.println("We start the test method with i");
        person.setName("Pepe");
        System.out.println("The test method ends");
    }

}
