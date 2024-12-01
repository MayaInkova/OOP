package Encapsulation;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoomManager {
    private final List<Room> rooms;
    private static final Logger logger = Logger.getLogger(RoomManager.class.getName());

    // Constructor to initialize the RoomManager with a list of rooms
    public RoomManager(List<Room> rooms) {
        this.rooms = rooms;
    }

    // Method to view available rooms
    public void viewRooms() {
        try {
            if (rooms.isEmpty()) {
                System.out.println("No rooms available.");
            } else {
                System.out.println("Available rooms:");
                for (Room room : rooms) {
                    // Check room status before displaying
                    if (room.getStatus().equalsIgnoreCase("available")) {
                        System.out.println(room.getRoomNumber() + " - " + room.getType() +
                                " - Price: " + room.getPricePerNight() + " - Status: " + room.getStatus());
                    }
                }
            }
        } catch (Exception e) {
            // Log the exception using the logger
            logger.log(Level.SEVERE, "Error viewing rooms", e);
        }
    }

    // Method to add a new room to the hotel
    public void addRoom(Room room) {
        try {
            rooms.add(room);
            System.out.println("Room added successfully: " + room.getRoomNumber());
        } catch (Exception e) {
            // Log the exception using the logger
            logger.log(Level.SEVERE, "Error adding room", e);
        }
    }

    // Method to book a room
    public void bookRoom(int roomNumber) {
        try {
            Room roomToBook = findRoomByNumber(roomNumber);
            if (roomToBook != null && roomToBook.getStatus().equalsIgnoreCase("available")) {
                roomToBook.setStatus("booked");
                System.out.println("Room " + roomNumber + " has been booked.");
            } else if (roomToBook == null) {
                System.out.println("Room " + roomNumber + " not found.");
            } else {
                System.out.println("Room " + roomNumber + " is already booked.");
            }
        } catch (Exception e) {
            // Log the exception using the logger
            logger.log(Level.SEVERE, "Error booking room", e);
        }
    }

    // Method to cancel a room booking
    public void cancelBooking(int roomNumber) {
        try {
            Room roomToCancel = findRoomByNumber(roomNumber);
            if (roomToCancel != null && roomToCancel.getStatus().equalsIgnoreCase("booked")) {
                roomToCancel.setStatus("available");
                System.out.println("Room " + roomNumber + " booking has been canceled.");
            } else if (roomToCancel == null) {
                System.out.println("Room " + roomNumber + " not found.");
            } else {
                System.out.println("Room " + roomNumber + " is not booked.");
            }
        } catch (Exception e) {
            // Log the exception using the logger
            logger.log(Level.SEVERE, "Error canceling booking", e);
        }
    }

    // Helper method to find a room by its number
    private Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null; // Return null if room not found
    }

    // Method to get a summary of all rooms
    public void getRoomSummary() {
        try {
            if (rooms.isEmpty()) {
                System.out.println("No rooms available.");
            } else {
                System.out.println("Room Summary:");
                for (Room room : rooms) {
                    System.out.println("Room " + room.getRoomNumber() + " - " +
                            room.getType() + " - Price: " + room.getPricePerNight() +
                            " - Status: " + room.getStatus());
                }
            }
        } catch (Exception e) {
            // Log the exception using the logger
            logger.log(Level.SEVERE, "Error retrieving room summary", e);
        }
    }
}

