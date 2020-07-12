
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.size() > 0) {
            String elementsStr = "";
            String suffix = "";
            if (elements.size() > 1) {
                suffix = "s";
            }
            for (int i = 0; i < elements.size(); i++) {
                elementsStr += elements.get(i);
                if (i != (elements.size() - 1)) {
                    elementsStr += "\n";
                }
            }
            return "The collection " + name + " has " + elements.size() 
                    + " element" + suffix + ":\n" + elementsStr;
        } else {
            return "The collection " + name+ " is empty.";
        }
    }
    
}
