package Encapsulation;

public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private double cancellationFee;
    private String status;

    public Room(int roomNumber, String type, double pricePerNight, double cancellationFee, String status) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.cancellationFee = cancellationFee;
        this.status = status;
    }

    // Гетъри и сетъри
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - Price: " + pricePerNight + " - Status: " + status;
    }
}

