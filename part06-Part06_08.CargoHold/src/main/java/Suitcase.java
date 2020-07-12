
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }
    
    public void printItems() {
        for (Object item : items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        Item result = null;
        for (Item item : items) {
            if (result == null || item.getWeight() > result.getWeight()) {
                result = item;
            }
        }
        return result;
    }
    
    public String toString() {
        String result = "";
        if (items.size() > 0) {
            result += items.size();
        } else {
            result += "no";
        }
        result += " item";
        if (items.size() != 1) {
            result += "s";
        }
        return result + " (" + totalWeight() + " kg)";
    }

}
