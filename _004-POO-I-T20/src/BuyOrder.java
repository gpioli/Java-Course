/* La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:
    Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental, descripcion String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.
    En la clase OrdenCompra, crear constructor que inicialice solo la descripción. OK
    En la clase OrdenCompra, crear métodos getter para todos los atributos. OK
    En la clase OrdenCompra implementar sólo métodos set para cliente y fecha. OK

    Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto
     (Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter. OK

    La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.

    Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int, inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter. OK
    Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter. OK

    Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:
        Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.
        Para cada una imprimir sus valores en consola usando método getter incluyendo los productos, donde con el método getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio. Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.
* */

import java.util.Date;

public class BuyOrder {

    private int id;
    private static int lastId;
    private String description;
    private Date date;
    private Client client;
    private Product[] products;
    private int productIndex;


    public BuyOrder(String description) {
        this.id = lastId++;
        this.description = description;
        this.products = new Product[4];
    }


    public int getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product[] getProducts() {
        return products;
    }


    public BuyOrder addProduct(Product product){
        if (productIndex < products.length) {
            this.products[productIndex++] = product;
        } else {
            System.out.println("Unable to add more products to this order. ");
        }
        return this;
    }

    public double grandTotal(){
        int runningTotal = 0;
        for(Product p: this.products) {
            runningTotal += p.getPrice();
        }
        return runningTotal;
    }

    public String viewDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n\n=====Buy order #%s =====", this.getId()) )
                .append(("\n\t" + this.getDate()))
                .append("\n\t" + this.getClient())
                .append("\n\t" + this.getDescription());
        for (Product p: this.getProducts()) {
            sb.append("\n").append(p);
        }
        sb.append("\nGRAND TOTAL: ").append(this.grandTotal());
        sb.append("\n=====================");

        return sb.toString();
    }

}
