
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }
    
    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        recipeList.load(fileName);
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        while (true) {
            System.out.print("\nEnter command: ");
            String cmd = scanner.nextLine();
            if (cmd.equals("list")) {
                recipeList.print();
            } else if (cmd.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                recipeList.printByName(word);
            } else if (cmd.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                recipeList.printByTime(time);
            } else if (cmd.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeList.printByIngredient(ingredient);
            } else if (cmd.equals("stop")) {
                break;
            } else {
                System.out.println("\nUnknown command");
            }
        }
    }
    
}
