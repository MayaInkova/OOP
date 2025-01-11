package InheritancentEndInterfaces;
import java.util.*;
public class Order {
    private Map<Item, Integer> orderItems = new HashMap<>();

    public void addItem(Item item, int quantity) {
        if (item != null && item.getQuantity() >= quantity) {
            orderItems.put(item, quantity);
            item.reduceQuantity(quantity);
        } else {
            System.out.println("Няма достатъчно наличност.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Item, Integer> entry : orderItems.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}
