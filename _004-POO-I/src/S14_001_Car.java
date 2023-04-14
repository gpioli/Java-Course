import java.util.Date;

public class S14_001_Car {

    public static void main(String[] args) {

        // Instantiating the object
        Car subaru = new Car("Subaru", "Impreza");

        // this will print default values
        System.out.println("car.manufacturer = " + subaru.getManufacturer());
        System.out.println("car.model = " + subaru.getModel());
        System.out.println("car.color = " + subaru.getColor());
        System.out.println("car.cc = " + subaru.getTank());

        Motor motorSubaru = new Motor(2.0, MotorType.BENCINA);
        subaru.setMotor(motorSubaru);
        subaru.setColor(Color.WHITE);
        subaru.setTank(new Tank());
        System.out.println("Max speed route: " + Car.MAX_SPEED_ROUTE);
        System.out.println("Max speed city: " + Car.MAX_SPEED_CITY);
        subaru.setType(CarType.HATCHBACK);

        System.out.println();
        subaru.viewDetail();



        Car mazda = new Car();
        mazda.setManufacturer("Mazda");
        mazda.setModel("BT-50");
        mazda.setType(CarType.PICKUP);
        mazda.setMotor(new Motor(3.0, MotorType.DIESEL));
        mazda.setColor(Color.RED);

        Car nissan = new Car("Nissan", "Navara", Color.GREY, new Motor(4.0,MotorType.DIESEL), new Tank());
        nissan.setType(CarType.PICKUP);
        Car nissan2 = new Car("Nissan", "Navara", Color.GREY, new Motor(3.5,MotorType.BENCINA), new Tank(50));
        nissan2.setType(CarType.PICKUP);

        System.out.println("Are these objects equals? (nissan and nissan2) " + (nissan == nissan2));
        System.out.println("Are these objects equals? (nissan and nissan2) " + (nissan.equals(nissan2)));

        System.out.println(nissan.viewDetail());
        Car.plateColor = Color.GREEN; // here we are modifying a static variable... this is not recommended
        // rigth way would be with a setter
        Car.setPlateColor(Color.BLUE);
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

        System.out.println(nissan);
        System.out.println(nissan.toString());


        // static method and the right way of calling them:
        System.out.println("Static method: ");
        System.out.println("Subaru km / L: " + Car.calculateStaticConsumption(300,60));
        System.out.println("Nissan km / L: " + Car.calculateStaticConsumption(300, 60));


        System.out.println("subaru = " + subaru);
        System.out.println("mazda = " + mazda);
        System.out.println("nissan = " + nissan);
        System.out.println("nissan2 = " + nissan2);

        CarType subaruType = subaru.getType();
        System.out.println("subaru type = " + subaruType.getName());
        System.out.println("subaru description = " + subaruType.getDescription());

    }

}
