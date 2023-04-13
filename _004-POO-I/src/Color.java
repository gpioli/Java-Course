public enum Color {
    RED("Red"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    GREY("Dark Grey"),
    WHITE("White"),
    GREEN("Green");

    // here we will personalize the atribute, passing it by constructor

    public final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
