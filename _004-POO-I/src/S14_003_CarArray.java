import java.util.Arrays;
import java.util.Date;

public class S14_003_CarArray {

    public static void main(String[] args) {

        Person subaruDriver = new Person("Luci", "Martinez");
        Car subaru = new Car("Subaru", "Impreza");

        subaru.setOwner(subaruDriver);

        Motor motorSubaru = new Motor(2.0, MotorType.BENCINA);
        subaru.setMotor(motorSubaru);
        subaru.setColor(Color.WHITE);
        subaru.setTank(new Tank());
        subaru.setType(CarType.HATCHBACK);


        Car mazda = new Car();
        Person pato = new Person("Pato", "Rodriguez");
        mazda.setOwner(pato);
        mazda.setManufacturer("Mazda");
        mazda.setModel("BT-50");
        mazda.setType(CarType.PICKUP);
        mazda.setMotor(new Motor(3.0, MotorType.DIESEL));
        //mazda.setTank(new Tank());
        mazda.setColor(Color.RED);


        Person bea = new Person("Bea", "Gonzalez");
                Car nissan = new Car("Nissan", "Navara", Color.GREY, new Motor(4.0, MotorType.DIESEL), new Tank());
        nissan.setOwner(bea);
        nissan.setType(CarType.PICKUP);

        Person lalo = new Person("Lalo", "Mena");
        Car suzuki = new Car("Suzuki", "Vitara", Color.GREY, new Motor(1.6, MotorType.BENCINA), new Tank(50));
        suzuki.setOwner(lalo);
        suzuki.setType(CarType.SUV);


        Car audi = new Car("Audi", "A3");
        audi.setOwner(new Person("Jano", "Perez"));

        Car[] cars = new Car[5];
        cars[0] = subaru;
        cars[1] = mazda;
        cars[2] = nissan;
        cars[3] = suzuki;
        cars[4] = audi;

        Arrays.sort(cars);
        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }

}

