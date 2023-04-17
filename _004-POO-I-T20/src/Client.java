/*
*     Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor
*  e implementar sus respectivos métodos getter.

 * */

public class Client {

    private String firstName;
    private String lastname;


    public Client(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }


    @Override
    public String toString() {
        return "Client: " +
                firstName + " " +
                lastname;
    }
}
