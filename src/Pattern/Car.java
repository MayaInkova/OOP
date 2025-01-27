package Pattern;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isElectric;

    Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.isElectric = builder.isElectric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

}
