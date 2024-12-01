package Encapsulation;

import java.util.List;
import java.util.logging.Logger;

public class RoomManager {
    private final List<Room> rooms; // Marked as final if reference won't change
    private static final Logger logger = Logger.getLogger(RoomManager.class.getName());

    public RoomManager(List<Room> rooms) {
        this.rooms = rooms;
    }

    // Method to view rooms
    public void viewRooms() {
        try {
            if (rooms.isEmpty()) {
                System.out.println("No rooms available.");
            } else {
                System.out.println("Available rooms:");
                for (Room room : rooms) {
                    System.out.println(room.getRoomNumber() + " - " + room.getType() + " - Price: " + room.getPricePerNight() + " - Status: " + room.getStatus());
                }
            }
        } catch (Exception e) {
            logger.severe("Failed to display rooms: " + e.getMessage());
            logger.throwing(RoomManager.class.getName(), "viewRooms", e);
        }
    }

    // Method to add a room
    public void addRoom(Room room) {
        try {
            rooms.add(room);
        } catch (Exception e) {
            logger.severe("Failed to add room: " + e.getMessage());
            logger.throwing(RoomManager.class.getName(), "addRoom", e);
        }
    }
}
