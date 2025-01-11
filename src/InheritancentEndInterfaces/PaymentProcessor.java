package InheritancentEndInterfaces;

public class PaymentProcessor {
    public boolean processPayment(double amount) {
        System.out.println("Обработване на плащане в размер на: " + amount);
        return true;
    }
}

