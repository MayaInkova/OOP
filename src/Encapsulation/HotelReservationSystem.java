package Encapsulation;

import java.io.*;
import java.util.*;

public class HotelReservationSystem {
    private static final String ROOMS_FILE = "data/rooms.json";
    private static final String USERS_FILE = "data/users.json";
    private static final String BOOKINGS_FILE = "data/bookings.json";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeFiles();
        mainMenu();
    }

    private static void initializeFiles() {
        new File("data").mkdirs();
        createFileIfNotExists(ROOMS_FILE);
        createFileIfNotExists(USERS_FILE);
        createFileIfNotExists(BOOKINGS_FILE);
    }

    private static void createFileIfNotExists(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("{}");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Add Room");
            System.out.println("2. Register User");
            System.out.println("3. Book Room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    registerUser();
                    break;
                case 3:
                    bookRoom();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private static void addRoom() {
        System.out.print("Enter room number: ");
        String roomNumber = scanner.nextLine();
        System.out.print("Enter room type: ");
        String roomType = scanner.nextLine();
        System.out.print("Enter price per night: ");
        double pricePerNight = scanner.nextDouble();
        scanner.nextLine();

        // Saving room data (simplified for example purposes)
        System.out.println("Room added successfully!");
    }

    private static void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        // Saving user data (simplified for example purposes)
        System.out.println("User registered successfully!");
    }

    private static void bookRoom() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter room number to book: ");
        String roomNumber = scanner.nextLine();

        // Booking room data (simplified for example purposes)
        System.out.println("Room booked successfully!");
    }
}
