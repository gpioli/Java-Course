public class Car {
    String manufacturer;
    String model;
    String color = "grey"; // default value
    double cc;

    // creating our first method:
    public String detail(){
        StringBuilder sb = new StringBuilder();
        sb.append("\ncar.manufacturer = " + this.manufacturer);
        sb.append("\ncar.model = " + this.model);
        sb.append("\ncar.color = " + this.color);
        sb.append("\ncar.cc = " + this.cc);
        return sb.toString();
    };

}
