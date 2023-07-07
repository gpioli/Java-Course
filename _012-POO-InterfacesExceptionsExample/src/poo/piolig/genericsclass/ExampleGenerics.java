package poo.piolig.genericsclass;

public class ExampleGenerics {
    public static void main(String[] args) {


        Truck<Animal> horsesTransport = new Truck <Animal>(5);
        horsesTransport.add(new Animal("Jack", "Horse"));
        horsesTransport.add(new Animal("Spirit", "Horse"));
        horsesTransport.add(new Animal("Cricket", "Horse"));
        horsesTransport.add(new Animal("Tunquen", "Horse"));
        horsesTransport.add(new Animal("Strike", "Horse"));


        printTruck(horsesTransport);

        System.out.println("---------------------");

        Truck <Machinery> machineryTransport = new Truck<>(3);
        machineryTransport.add(new Machinery("Bulldozer"));
        machineryTransport.add(new Machinery("Driller"));
        machineryTransport.add(new Machinery("Crane"));

        printTruck(machineryTransport);

        System.out.println("---------------------");

        Truck <Car> carTransport = new Truck<>(3);
        carTransport.add(new Car("Mitsubishi"));
        carTransport.add(new Car("Chevrolet"));
        carTransport.add(new Car("Toyota"));

        printTruck(carTransport);

    }

    public static <T> void printTruck(Truck<T> truck) {
        for (T element: truck) {
            if (element instanceof Animal) {
                System.out.println("Type of animal: " + ((Animal) element).getType() + ", name: " + ((Animal) element).getName());
            }
            if (element instanceof Car){
                System.out.println("Car manufacturer: " + ((Car) element).getManufacturer());
            }
            if (element instanceof Machinery){
                System.out.println("Type of machinery: " + ((Machinery) element).getType());
            }
        }

    }
}


