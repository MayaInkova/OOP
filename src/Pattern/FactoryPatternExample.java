package Pattern;

public class FactoryPatternExample {
    public static void main(String[] args) {
        // Създаване на различни превозни средства чрез фабриката
        Vehicle car = VehicleFactory.getVehicle("car");
        Vehicle motorcycle = VehicleFactory.getVehicle("motorcycle");
        Vehicle truck = VehicleFactory.getVehicle("truck");

        // Извикване на метода move() за всяко превозно средство
        car.move();
        motorcycle.move();
        truck.move();
    }
}

