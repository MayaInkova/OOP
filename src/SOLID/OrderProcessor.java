package SOLID;

public class OrderProcessor {
    public void process(Order order) {
        System.out.println("Processing order: " + order.getProduct() + " x" + order.getQuantity());
    }
}

