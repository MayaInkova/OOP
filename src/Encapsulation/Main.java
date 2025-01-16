package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Създаване на нова банкова сметка
        BankAccount account1 = new BankAccount("BG123456", "Иван Иванов", 1000);

        // Депозиране и теглене на пари
        System.out.println(account1.getAccountInfo());
        account1.deposit(500);
        account1.withdraw(300);

        // Извеждане на информация
        System.out.println(account1.getAccountInfo());
    }
}

