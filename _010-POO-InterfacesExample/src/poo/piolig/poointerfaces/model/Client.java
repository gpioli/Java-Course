package poo.piolig.poointerfaces.model;

import java.util.Objects;

public class Client {

    private Integer id;
    private String name;
    private String lastName;
    private static int lastId;

    public Client() {
        this.id = ++ lastId;
    }

    public Client(String name, String lastName) {
        this();
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
