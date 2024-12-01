package Encapsulation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class RoomManager {
    private  static final String FILE_NAME = "rooms.csv";
    private List<Room> rooms;

    public RoomManager() {
        rooms = new ArrayList<>();
        loadRooms();
    }

    private void loadRooms() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int roomNumber = Integer.parseInt(parts[0]);
                String type = parts[1];
                double pricePerNight = Double.parseDouble(parts[2]);
                double cancellationFee = Double.parseDouble(parts[3]);
                String status = parts[4];
                rooms.add(new Room(roomNumber, type, pricePerNight, cancellationFee, status));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveRooms() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Room room : rooms) {
                writer.write(room.getRoomNumber() + "," + room.getType() + "," + room.getPricePerNight() + "," +
                        room.getCancellationFee() + "," + room.getStatus());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getStatus().equals("available")) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
}
