public class Person {

    private String name;
    private String secondName;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return name + " " + secondName ;
    }
}
