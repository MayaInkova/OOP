package Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;


    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Метод за добавяне на пари
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " лв. добавени успешно.");
        } else {
            System.out.println("Сумата трябва да бъде положителна.");
        }
    }

    // Метод за теглене на пари
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " лв. изтеглени успешно.");
        } else {
            System.out.println("Недостатъчно средства или невалидна сума.");
        }
    }

    // Метод за извличане на информация за акаунта
    public String getAccountInfo() {
        return "Сметка на: " + ownerName + "\nНомер: " + accountNumber + "\nБаланс: " + balance + " лв.";
    }

    // Гетъри и сетъри (ако са необходими)
    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}


