package SOLID;

public class Main {

        public static void main(String[] args) {
            PaymentProcessor processor = new PaymentProcessor();

            // Създаване на инстанции на правилните класове
            PaymentMethod creditCard = new CreditCardPayment(); // Правилно създадена променлива
            PaymentMethod payPal = new PayPalPayment();         // Правилно създадена променлива


            // Обработка на плащанията
            processor.processPayment(creditCard, 100.0);  // Правилно създаден обект от клас CreditCardPayment
            processor.processPayment(payPal, 200.0);      // Правилно създаден обект от клас PayPalPayment


        }
    }

