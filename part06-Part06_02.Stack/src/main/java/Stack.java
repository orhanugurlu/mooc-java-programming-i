
import java.util.ArrayList;

public class Stack {

    ArrayList<String> items;

    public Stack() {
        items = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return (items.size() == 0);
    }
    
    public void add(String value) {
        items.add(0, value);
    }

    public String take() {
        String result = null;
        if (!isEmpty()) {
            result = items.remove(0);
        }
        return result;
    }
    
    public ArrayList<String> values() {
        return items;
    }
    
}
