public class Car {
    private String manufacturer;
    private String model;
    private String color = "grey"; // default value
    private double cc;
    private int tankCapacity = 40;

    public String getManufacturer() {
        return manufacturer;
    }

    // creating the constructor

    public Car(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // It is possible to have multiple constructors (constructor overload)


    public Car() {
    }

    public Car (String manufacturer, String model, String color) {
        this(manufacturer, model); // re-using the previous constructor
        this.color = color;
    }

    public Car(String manufacturer, String model, String color, double cc) {
        this(manufacturer, model, color);
        this.cc = cc;
    }

    public Car(String manufacturer, String model, String color, double cc, int tankCapacity) {
        this(manufacturer, model, color, cc);
        this.tankCapacity = tankCapacity;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    // creating our first method:
    public String viewDetail() {
        StringBuilder sb = new StringBuilder();
        sb.append("\ncar.manufacturer = " + this.manufacturer); // we could also use this.getManufacturer
        sb.append("\ncar.model = " + this.model); // its the same
        sb.append("\ncar.color = " + this.color);
        sb.append("\ncar.cc = " + this.cc);
        return sb.toString();
    }

    ;

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
        return km/(tankCapacity*fuelPercentage);
    }

    public float calculateConsumption(int km, int fuelPercentage){
        return km/((tankCapacity*fuelPercentage)/100f);
    }

}
