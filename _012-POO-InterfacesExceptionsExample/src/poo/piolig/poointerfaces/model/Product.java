package poo.piolig.poointerfaces.model;

public class Product extends GenericEntity {

    private String description;
    private Double price;

    public Product(String description, double price) {
        super();
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "description='" + description + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
