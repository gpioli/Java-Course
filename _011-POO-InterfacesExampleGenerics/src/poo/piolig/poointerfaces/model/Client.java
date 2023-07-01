package poo.piolig.poointerfaces.model;

import java.util.Objects;

public class Client extends GenericEntity {

    private String name;
    private String lastName;


    public Client(String name, String lastName) {
        super();
        this.name = name;
        this.lastName = lastName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Cliente id=" + id +
                ", name='" + name + "'" +
                ", lastName='" + lastName + "'";
    }

}
