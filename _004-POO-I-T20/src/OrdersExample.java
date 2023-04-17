/*
* Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:
        Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden
         con distintos productos, que no se repitan.

        Para cada una imprimir sus valores en consola usando método getter incluyendo los productos, donde con el método
        getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante,
        * nombre y precio. Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.
* */


import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class OrdersExample {

    public static void main(String[] args) {

        BuyOrder buyOrder1 = new BuyOrder("Buy order #1");
        buyOrder1.setDate(new Date(2023, 4, 1, 12, 30));
        buyOrder1.setClient(new Client("Andres", "Laguna"));
        buyOrder1.addProduct(new Product("Duracell", "AAA Batteries", 3))
                .addProduct(new Product("M&M", "M&M Chocolate", 5))
                .addProduct(new Product("Palmolive", "Palmolive Soap", 1))
                .addProduct(new Product("Nestle", "Nestle Coffee", 4));

        System.out.println(buyOrder1.viewDetails());


        System.out.println("===Buy order #2 ===");
        BuyOrder buyOrder2 = new BuyOrder("Buy order #2");
        buyOrder2.setDate(new Date(2023, 4, 2, 15, 1));
        buyOrder2.setClient(new Client("Maria", "Alloy"));
        buyOrder2.addProduct(new Product("Conaprole", "Cream Cheese", 4))
                .addProduct(new Product("Conaprole", "Milk", 1))
                .addProduct(new Product("Bimbo", "Integral bread", 2))
                .addProduct(new Product("Conaprole", "Yogurt", 2));

        System.out.println(buyOrder2.viewDetails());


        BuyOrder buyOrder3 = new BuyOrder("Buy order #3");
        buyOrder3.setDate(new Date(2023, 4, 3, 8,15));
        buyOrder3.setClient(new Client("Stefania", "Napoli"));
        buyOrder3.addProduct(new Product("P&G", "Rubbish bags", 3))
                .addProduct(new Product("P&G", "Bugs killer", 4))
                .addProduct(new Product("P&G", "Floor cleaning product", 4))
                .addProduct(new Product("P&G", "Windows cleaner", 3));

        System.out.println(buyOrder3.viewDetails());

    }
}
