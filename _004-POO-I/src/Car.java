public class Car {

    private int id;
    private String manufacturer;
    private String model;
    private Color color = Color.GREY; // default value
    private Motor motor;
    private Tank tank;
    private Person owner;
    private Tire[] tires;

    private CarType type;

    private static int staticTankCapacity = 30;


    private static int lastId;

    static Color plateColor = Color.GREY;

    public static final Integer MAX_SPEED_ROUTE = 120; // Here we are declaring a constant
    public static final Integer MAX_SPEED_CITY = 60; //

    public static final String RED_COLOR = "Red";
    public static final String YELLOW_COLOR = "Yellow";
    public static final String BLUE_COLOR = "Blue";
    public static final String WHITE_COLOR = "White";
    public static final String GREY_COLOR = "Dark Grey";

    public String getManufacturer() {
        return manufacturer;
    }

    // creating the constructor

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car(String manufacturer, String model){
        this();
        this.manufacturer = manufacturer;
        this.model = model;
    }

// It is possible to have multiple constructors (constructor overload)


    public Car() {
        this.id = ++lastId;
    }

    public Car (String manufacturer, String model, Color color) {
        this(manufacturer, model); // re-using the previous constructor
        this.color = color;
    }

    public Car(String manufacturer, String model, Color color, Motor motor) {
        this(manufacturer, model, color);
        this.motor = motor;
    }

    public Car(String manufacturer, String model, Color color, Motor motor, Tank tank) {
        this(manufacturer, model, color, motor);
        this.tank = tank;
    }

    public Car(String manufacturer, String model, Color color, Motor motor, Tank tank, Person owner, Tire[] tires) {
        this(manufacturer, model, color, motor, tank);
        this.owner = owner;
        this.tires = tires;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public static void setStaticTankCapacity(int staticTankCapacity) {
        Car.staticTankCapacity = staticTankCapacity;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    // creating our first method:
    public String viewDetail() {
        StringBuilder sb = new StringBuilder();
        sb.append("\ncar.id = " + this.id);
        sb.append("\ncar.manufacturer = " + this.manufacturer); // we could also use this.getManufacturer
        sb.append("\ncar.model = " + this.model); // its the same
        sb.append("\ncar.type = " + this.getType().getName());
        sb.append("\ncar.color = " + this.color);
        sb.append("\ncar.plateColor = " + plateColor); // notice that as this is a static method, we reference to it
        // without the "this" keyword
        sb.append("\ncar.cc = " + this.motor.getCc());
        return sb.toString();
    }

    public static Color getPlateColor(){
        return plateColor;
    }

    public static void setPlateColor(Color color){
        Car.plateColor = color;
    }

    public String accelerate(int rpm) {
        return "car " + manufacturer + " accelerating to " + rpm + " rpm.";
    }

    public String stop(){ // break is a reserved work
        return this.manufacturer + " " + this.model + " breaking";
    }

    // combining both methods in one
    public String accelerateBreak(int rpm){
        String accelerate = this.accelerate(rpm);
        String stop = this.stop();
        return accelerate + "\n" + stop();
    }

    public float calculateConsumption(int km, float fuelPercentage){
        return km/(tank.getCapacity()*fuelPercentage);
    }

    public float calculateConsumption(int km, int fuelPercentage){
        return km/((tank.getCapacity()*fuelPercentage)/100f);
    }

    public static float calculateStaticConsumption(int km, int fuelPercentage){
        return km/((Car.staticTankCapacity *fuelPercentage)/100f);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id: " + this.id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cc=" + motor.getCc() +
                ", tankCapacity=" + tank.getCapacity() +
                '}';
    }

    // We override the equals method
    @Override
    public boolean equals(Object obj) {

        // comparing memory allocation
        if (this == obj) {
            return true;
        }

        // Here we avoid the code from crashing in case we compare different object types
        if ( !(obj instanceof Car) ) {
            return false;
        }

        Car a = (Car) obj;
        return (this.manufacturer != null && this.model != null &&
                this.manufacturer.equals(a.getManufacturer()) &&
                this.model.equals(a.getModel()));


    }
}
