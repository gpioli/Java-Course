public class Car {
    String manufacturer;
    String model;
    String color = "grey"; // default value
    double cc;
    int tankCapacity = 40;

    // creating our first method:
    public String viewDetail() {
        StringBuilder sb = new StringBuilder();
        sb.append("\ncar.manufacturer = " + this.manufacturer);
        sb.append("\ncar.model = " + this.model);
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
