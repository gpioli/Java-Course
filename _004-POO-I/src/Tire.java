public class Tire {

    private String manufacturer;
    private int ring;
    private double wide;

    public Tire(String manufacturer, int ring, double wide) {
        this.manufacturer = manufacturer;
        this.ring = ring;
        this.wide = wide;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRing() {
        return ring;
    }

    public double getWide() {
        return wide;
    }
}
