
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        RecipeList recipeList = new RecipeList();
        
        UserInterface ui = new UserInterface(consoleScanner, recipeList);
        ui.start();
    }

}
