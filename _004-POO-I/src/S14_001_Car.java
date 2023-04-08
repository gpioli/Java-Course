public class S14_001_Car {

    public static void main(String[] args) {

        // Instantiating the object
        Car subaru = new Car();

        // this will print default values
        System.out.println("car.manufacturer = " + subaru.manufacturer);
        System.out.println("car.model = " + subaru.model);
        System.out.println("car.color = " + subaru.color);
        System.out.println("car.cc = " + subaru.cc);

        subaru.manufacturer = "Subaru";
        subaru.model = "Impreza";
        subaru.cc = 2.0;
        subaru.color = "White";

        System.out.println();
        subaru.viewDetail();


        Car mazda = new Car();
        mazda.manufacturer = "Mazda";
        mazda.model = "BT-50";
        mazda.cc = 3.0;
        mazda.color = "Red";

        System.out.println();
        System.out.println(mazda.viewDetail());
        System.out.println(subaru.viewDetail());
        System.out.println(subaru.accelerate(3000));
        System.out.println(subaru.stop());

        System.out.println(mazda.accelerateBreak(4000));

        System.out.println("Km per litre " + subaru.calculateConsumption(300, 0.6f));
        System.out.println("Km per litre " + subaru.calculateConsumption(300, 60));
    }

}
