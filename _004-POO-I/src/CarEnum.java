import java.sql.SQLOutput;
import java.util.Date;

public class CarEnum {

    public static void main(String[] args) {

        Car.setStaticTankCapacity(45);
        Car subaru = new Car("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, MotorType.BENCINA));
        subaru.setColor(Color.WHITE);
        subaru.setType(CarType.HATCHBACK);

        Car mazda = new Car("Mazda", "BT-50", Color.RED, new Motor(3.0, MotorType.DIESEL));
        mazda.setType(CarType.PICKUP);
        System.out.println("mazda manufacturer: " + mazda.getManufacturer());

        CarType subaruType = subaru.getType();
        System.out.println("Subaru type: " + subaruType.getName());
        System.out.println("Subaru desc. : " + subaruType.getDescription());

        switch (subaruType){
            case CONVERTIBLE:
                System.out.println("The car is a sportscar convertible of two doors");
                break;
            case COUPE:
                System.out.println("The car is a small two door and typically sport-car");
                break;
            case WAGON:
                System.out.println("The car is an utilitary typically used for businesses");
                break;
            case PICKUP:
                System.out.println("The car is a double cabin truck");
            case SEDAN:
                System.out.println("The car is a medium size car");
                break;
            case STATION_WAGON:
                System.out.println("Bigger car with huge trunk");
                break;
        }

        CarType[] types = CarType.values();
        for(CarType type: types) {
            System.out.println(type + " => " + type.name() + ", " +
                    type.getName() + ", " + type.getDescription() + ", " + type.getDoorsNum());
        }

    }
}