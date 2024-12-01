package Encapsulation;

public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private double cancellationFee;
    private String status;

    // Constructor
    public Room(int roomNumber, String type, double pricePerNight, double cancellationFee, String status) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.cancellationFee = cancellationFee;
        this.status = status;
    }

    // Getter and Setter methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;  // This method was missing and is needed to fix the error
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public double getCancellationFee() {
        return cancellationFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Override toString method for easy display of room information
    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - Price: " + pricePerNight + " - Status: " + status;
    }
}