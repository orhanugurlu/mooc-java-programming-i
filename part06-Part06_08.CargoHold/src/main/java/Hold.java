
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeight() + suitcase.totalWeight()) <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }    
}
