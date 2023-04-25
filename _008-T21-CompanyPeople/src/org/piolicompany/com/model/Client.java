package org.piolicompany.com.model;

public class Client extends Person {

    private int clientId;
    private int clientIdIndex;


    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        this.clientId = ++clientIdIndex;
    }


    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ClientId: " + clientId;

    }
}
