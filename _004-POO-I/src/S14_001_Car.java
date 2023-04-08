public class S14_001_Car {

    public static void main(String[] args) {

        // Instantiating the object
        Car car = new Car();

        // this will print default values
        System.out.println("car.manufacturer = " + car.manufacturer);
        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println("car.cc = " + car.cc);

        car.manufacturer = "Subaru";
        car.model = "Impreza";
        car.cc = 2.0;
        car.color = "White";

        System.out.println();
        System.out.println("car.manufacturer = " + car.manufacturer);
        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println("car.cc = " + car.cc);

        Car mazda = new Car();
        mazda.manufacturer = "Mazda";
        mazda.model = "BT-50";
        mazda.cc = 3.0;
        mazda.color = "Red";

        System.out.println();
        System.out.println("mazda.manufacturer = " + mazda.manufacturer);
        System.out.println("car.model = " + mazda.model);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cc = " + mazda.cc);

    }

}
