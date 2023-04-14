public class Motor {

    private double Cc;
    private MotorType type;

    public Motor() {
    }

    public Motor(double cc, MotorType type) {
        Cc = cc;
        this.type = type;
    }

    public double getCc() {
        return Cc;
    }

    public void setCc(double cc) {
        Cc = cc;
    }

    public MotorType getType() {
        return type;
    }

    public void setType(MotorType type) {
        this.type = type;
    }
}
