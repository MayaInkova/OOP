package InheritancentEndInterfaces;

import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Scanner scanner = new Scanner(System.in);
        Order order = new Order(); // Добавено за да е достъпна в case 5


        System.out.println("Добре дошли в E-commerce Console Application!");
        displayMenu();

        boolean isRunning = true;
        while (isRunning) {
            System.out.print("Въведете команда (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Изчистване на буфера

            switch (choice) {
                case 1:
                    // Извеждане на всички артикули в инвентара
                    inventoryManager.listItems();
                    break;
                case 2:
                    // Добавяне на нов артикул в инвентара
                    System.out.println("Въведете име на артикула: ");
                    String name = scanner.nextLine();
                    System.out.println("Въведете категория: ");
                    String category = scanner.nextLine();
                    System.out.println("Въведете цена: ");
                    double price = scanner.nextDouble();
                    System.out.println("Въведете количество: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    inventoryManager.addItem(new Item(name, category, price, quantity));
                    break;
                case 3:
                    // Започване на поръчка
                    order  = new Order();
                    boolean addingItems = true;
                    while (addingItems) {
                        System.out.println("Въведете име на артикул за поръчка: ");
                        String orderItemName = scanner.nextLine();
                        System.out.println("Въведете количество: ");
                        int orderQuantity = scanner.nextInt();
                        scanner.nextLine();
                        order.addItem(inventoryManager.getItemByName(orderItemName), orderQuantity);
                        System.out.println("Добавяне на още артикули? (yes/no)");
                        addingItems = scanner.nextLine().equalsIgnoreCase("yes");
                    }
                    System.out.println("Обща сума: " + order.calculateTotal());
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Изход от приложението.");
                    break;
                case 5:
                    System.out.println("Изберете метод на плащане (1. Кредитна карта, 2. PayPal): ");
                    int paymentChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (paymentChoice == 1) {
                        System.out.println("Въведете номер на кредитната карта: ");
                        String cardNumber = scanner.nextLine();
                        paymentProcessor.processCreditCardPayment(order.calculateTotal(), cardNumber);
                    } else if (paymentChoice == 2) {
                        System.out.println("Въведете PayPal акаунт: ");
                        String paypalAccount = scanner.nextLine();
                        paymentProcessor.processPayPalPayment(order.calculateTotal(), paypalAccount);
                    } else {
                        System.out.println("Невалиден метод на плащане.");
                    }
                    break;
                default:
                    System.out.println("Невалидна команда. Моля, опитайте отново.");
            }
        }
    }

    // Показване на менюто
    private static void displayMenu() {
        System.out.println("\nМеню:");
        System.out.println("1. Изброяване на артикули");
        System.out.println("2. Добавяне на артикул");
        System.out.println("3. Създаване на поръчка");
        System.out.println("4. Изход");
        System.out.println("5. Обработка на плащане");
    }
}
