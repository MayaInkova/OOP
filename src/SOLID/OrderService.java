package SOLID;

public class OrderService {
    private PaymentMethod paymentMethod;
    private CreditCardPayment payment = new CreditCardPayment();

    public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}

