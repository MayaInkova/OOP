package InheritancentEndInterfaces;
import java.util.*;
public class InventoryManager {
    private List<Item> inventory = new ArrayList<>();

    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("Артикул добавен: " + item.getName());
    }

    public void listItems() {
        for (Item item : inventory) {
            System.out.println(item.getName() + " - Цена: " + item.getPrice());
        }
    }

    public Item getItemByName(String name) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}
