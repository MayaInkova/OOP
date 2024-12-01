package Encapsulation;

public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private double cancellationFee;
    private String status;

    // Constructor to initialize the Room object
    public Room(int roomNumber, String type, double pricePerNight, double cancellationFee, String status) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.cancellationFee = cancellationFee;
        this.status = status;
    }

    // Getter for roomNumber
    public int getRoomNumber() {
        return roomNumber;
    }

    // Getter for type of room (e.g., Deluxe, Single, etc.)
    public String getType() {
        return type;
    }

    // Getter for price per night
    public double getPricePerNight() {
        return pricePerNight;
    }

    // Getter for cancellation fee
    public double getCancellationFee() {
        return cancellationFee;
    }

    // Getter for status (available, booked, etc.)
    public String getStatus() {
        return status;
    }

    // Setter for status (used when updating room status to booked/available)
    public void setStatus(String status) {
        this.status = status;
    }

    // Override toString method for easy display of room information
    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - Price: " + pricePerNight + " - Status: " + status;
    }
}
