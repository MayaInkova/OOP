package Encapsulation;

public class Room {

    private int roomNumber;
    private String type;
    private double pricePerNight;
    private double cancellationFee;
    private String status; // available, booked

    public Room(int roomNumber, String type, double pricePerNight, double cancellationFee, String status) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.cancellationFee = cancellationFee;
        this.status = status;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public double getPricePerNight() { return pricePerNight; }
    public double getCancellationFee() { return cancellationFee; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", type='" + type + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", status='" + status + '\'' +
                '}';
    }
}

