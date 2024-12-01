package Encapsulation;

import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static RoomManager roomManager = new RoomManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Преглед на стаите");
            System.out.println("2. Резервиране на стая");
            System.out.println("3. Отмяна на резервация");
            System.out.println("4. Изход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    viewRooms();  // Call to the viewRooms() method
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Невалиден избор. Опитайте отново.");
            }
        }
    }

    // Method to view available rooms
    private static void viewRooms() {
        List<Room> availableRooms = roomManager.getAvailableRooms();
        if (availableRooms.isEmpty()) {
            System.out.println("Няма налични стаи.");
        } else {
            System.out.println("Налични стаи:");
            for (Room room : availableRooms) {
                System.out.println(room);  // Print room details using the toString method in the Room class
            }
        }
    }

    private static void bookRoom() {
        System.out.println("Въведете номер на стая, която искате да резервирате:");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        Room room = findRoom(roomNumber);
        if (room != null && room.getStatus().equals("available")) {
            room.setStatus("booked");
            roomManager.saveRooms();  // Save the updated room details to the file
            System.out.println("Стаята е успешно резервирана.");
        } else {
            System.out.println("Стаята не е налична или не съществува.");
        }
    }

    private static void cancelBooking() {
        System.out.println("Въведете номер на резервация за отмяна:");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        Room room = findRoom(roomNumber);
        if (room != null && room.getStatus().equals("booked")) {
            room.setStatus("available");
            roomManager.saveRooms();  // Save the updated room details to the file
            System.out.println("Резервацията е успешно отменена.");
        } else {
            System.out.println("Няма резервация за тази стая.");
        }
    }

    // Helper method to find room by room number
    private static Room findRoom(int roomNumber) {
        for (Room room : roomManager.getAvailableRooms()) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;  // Return null if room is not found
    }
}