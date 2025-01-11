package InheritancentEndInterfaces;

public class PaymentProcessor {

    // Метод за обработка на плащане с кредитна карта
    public void processCreditCardPayment(double amount, String cardNumber) {
        if (validateCardNumber(cardNumber)) {
            System.out.println("Успешно плащане с кредитна карта на стойност: " + amount + " лв.");
        } else {
            System.out.println("Невалиден номер на кредитна карта.");
        }
    }

    // Метод за обработка на плащане с PayPal
    public void processPayPalPayment(double amount, String paypalAccount) {
        if (validatePayPalAccount(paypalAccount)) {
            System.out.println("Успешно плащане с PayPal на стойност: " + amount + " лв.");
        } else {
            System.out.println("Невалиден PayPal акаунт.");
        }
    }

    // Примерна валидация за номер на кредитна карта
    private boolean validateCardNumber(String cardNumber) {
        return cardNumber.matches("\\d{16}");
    }

    // Примерна валидация за PayPal акаунт
    private boolean validatePayPalAccount(String paypalAccount) {
        return paypalAccount.contains("@");
    }
}



