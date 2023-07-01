package poo.piolig.poointerfaces.model;

public class PremiumClient extends Client implements Comparable{

    public PremiumClient(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
