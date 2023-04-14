public enum CarType {
    SEDAN("Sedan", "Medium car", 4),
    STATION_WAGON("Station Wagon", "Big car", 5),
    HATCHBACK("Hatchback", "Compact car", 5),
    PICKUP("Pickup", "Truck", 4),
    COUPE("Coupe", "Small car", 2),
    CONVERTIBLE("Convertible", "Sportscar", 2),
    WAGON("Wagon", "Utilitary", 3);

    private final String name;
    private final int doorsNum;
    private final String description;

    CarType(String name, String description, int doorsNum) {
        this.name = name;
        this.doorsNum = doorsNum;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getDoorsNum() {
        return doorsNum;
    }

    public String getDescription() {
        return description;
    }
}
