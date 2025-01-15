package SOLID;

// OCP: PaymentProcessor приема интерфейса
// PaymentMethod и може да се разширява с нови методи

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}

