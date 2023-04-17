/*
* Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int,
*  inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.*/

public class Product {

    private String manufacturer;
    private String name;
    private int price;

    public Product(String manufacturer, String name, int price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "\n\tmanufacturer: " + manufacturer +
                "\n\tname: " + name +
                "\n\tprice: " + price;
    }


}
