import java.util.*;

public class Inventory {
    private HashMap<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
    }

    // Add new item
    public void addItem(Item item) {
        items.put(item.getItemId(), item);
    }

    // Remove item
    public void removeItem(String itemId) {
        if(items.containsKey(itemId)) {
            items.remove(itemId);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update quantity
    public void updateQuantity(String itemId, int newQuantity) {
        Item item = items.get(itemId);
        if(item != null) {
            item.setQuantity(newQuantity);
            System.out.println("Quantity updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search by ID
    public Item searchById(String itemId) {
        return items.get(itemId);
    }

    // Search by Name
    public Item searchByName(String name) {
        for(Item item : items.values()) {
            if(item.getItemName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    // Display all items
    public void displayAllItems() {
        if(items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for(Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}
