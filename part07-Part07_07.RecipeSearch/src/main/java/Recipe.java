
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
    
    public boolean contains(String ingredient) {
        return ingredients.contains(ingredient);
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + time;
    }
    
}
