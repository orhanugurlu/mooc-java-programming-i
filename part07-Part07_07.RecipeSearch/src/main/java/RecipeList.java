
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeList {

    private ArrayList<Recipe> recipes;

    public RecipeList() {
        recipes = new ArrayList<>();
    }
    
    public void load(String fileName) {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int time = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    } else {
                        ingredients.add(line);
                    }
                }
                recipes.add(new Recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }              
    }
    
    public void print() {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void printByName(String word) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void printByTime(int time) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void printByIngredient(String ingredient) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

}
