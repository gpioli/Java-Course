import java.util.Date;

public class S14_001_Car {

    public static void main(String[] args) {

        // Instantiating the object
        Car subaru = new Car("Subaru", "Impreza");

        // this will print default values
        System.out.println("car.manufacturer = " + subaru.getManufacturer());
        System.out.println("car.model = " + subaru.getModel());
        System.out.println("car.color = " + subaru.getColor());
        System.out.println("car.cc = " + subaru.getCc());

        subaru.setCc(2.0);
        subaru.setColor("White");

        System.out.println();
        subaru.viewDetail();


        Car mazda = new Car();
        mazda.setManufacturer("Mazda");
        mazda.setModel("BT-50");
        mazda.setCc(3.0);
        mazda.setColor("Red");

        Car nissan = new Car("Nissan", "Navara", "Dark Grey", 3.5, 50);
        Car nissan2 = new Car("Nissan", "Navara", "Dark Grey", 3.5, 50);

        System.out.println("Are these objects equals? (nissan and nissan2) " + (nissan == nissan2));
        System.out.println("Are these objects equals? (nissan and nissan2) " + (nissan.equals(nissan2)));

        Car car = new Car();
        System.out.println(car.equals(nissan));

        Date date = new Date();
        System.out.println("Comparing different objects. Result: " + car.equals(date));

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
