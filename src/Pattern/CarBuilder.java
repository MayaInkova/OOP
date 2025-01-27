package Pattern;

public class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isElectric;

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setElectric(boolean electric) {
        isElectric = electric;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}

