package org.piolig.generics;

import org.piolig.generics.model.*;
import org.piolig.generics.impl.SupermarketBag;

public class SupermaketBagExample {
    public static void main(String[] args) {

    // Milky SupermarketBag instantiation
    SupermarketBag<Milky> milkyBag = new SupermarketBag<>();

    // Creation of Milky products
        milkyBag.addProduct(new Milky("Milk", 1d, 2, 150));
        milkyBag.addProduct(new Milky("Cheese", 5d, 1, 400));
        milkyBag.addProduct(new Milky("Yogurt", 2d, 2, 450));
        milkyBag.addProduct(new Milky("Butter", 2d, 1, 500));
        milkyBag.addProduct(new Milky("Flan", 2d, 2, 500));

        System.out.println("-----Milky products bag: -----");
        for (Milky p: milkyBag){
            System.out.println("Product name: " + p.getName() + "\n\tProduct price: " + p.getPrice() +
                    "\n\tProduct amount: " + p.getAmount() + "\n\tProduct proteins: " + p.getProteins());
        }

        // Fruit SupermarketBag instantiation
        SupermarketBag<Fruit> fruitBag = new SupermarketBag<>();

        // Creation of Fruit products
        fruitBag.addProduct(new Fruit("Kiwi", 1d, 2d, "Brown"));
        fruitBag.addProduct(new Fruit("Banana", 0.9d, 1d, "Yellow"));
        fruitBag.addProduct(new Fruit("Orange", 1d, 1d, "Orange"));
        fruitBag.addProduct(new Fruit("Apple", 1d, 0.8, "Red"));
        fruitBag.addProduct(new Fruit("Pineapple", 3d, 2d, "Copper"));

        System.out.println("-----Fruit products bag: -----");
        for (Fruit f: fruitBag){
            System.out.println("Product name: " + f.getName() + "\n\tProduct price: " + f.getPrice() +
                    "\n\tProduct weight: " + f.getWeight() + "\n\tProduct color: " + f.getColor());
        }

        // Cleaning SupermarketBag instantiation
        SupermarketBag<Cleaning> cleaningBag = new SupermarketBag<>();

        // Creation of Fruit products
        cleaningBag.addProduct(new Cleaning("Dishes Soap", 1d, "abc", 0.250));
        cleaningBag.addProduct(new Cleaning("Sodium hypochlorite", 0.9d, "xyz", 1.0));
        cleaningBag.addProduct(new Cleaning("Laundry Soap ", 1d, "pqr", 3.0));
        cleaningBag.addProduct(new Cleaning("Floor wax", 1d, "hgs", 1.5));
        cleaningBag.addProduct(new Cleaning("Car wax", 3d, "ppp", 2.0));

        System.out.println("-----Fruit products bag: -----");
        for (Cleaning c: cleaningBag){
            System.out.println("Product name: " + c.getName() + "\n\tProduct price: " + c.getPrice() +
                    "\n\tProduct components: " + c.getComponents() + "\n\tProduct litres: " + c.getLitres());
        }

        // NonPerishable SupermarketBag instantiation
        SupermarketBag<NonPerishable> nonPerishableBag = new SupermarketBag<>();

        // Creation of Fruit products
        nonPerishableBag.addProduct(new NonPerishable("Noodles", 1.0, 2, 700));
        nonPerishableBag.addProduct(new NonPerishable("Salad Peanuts", 1.9d, 4, 850));
        nonPerishableBag.addProduct(new NonPerishable("Tuna can", 4.0, 3, 950));
        nonPerishableBag.addProduct(new NonPerishable("Peas can", 2.0, 2, 750));
        nonPerishableBag.addProduct(new NonPerishable("Rice", 3.0, 3, 400));
        // This should and does not run (exceeds max elements size)
        //nonPerishableBag.addProduct(new NonPerishable("Vodka", 10.0, 1, 1500));

        System.out.println("-----Non perishable products bag: -----");
        for (NonPerishable n: nonPerishableBag){
            System.out.println("Product name: " + n.getName() + "\n\tProduct price: " + n.getPrice() +
                    "\n\tProduct content: " + n.getContent() + "\n\tProduct calories: " + n.getCalories());
        }

    }

}
