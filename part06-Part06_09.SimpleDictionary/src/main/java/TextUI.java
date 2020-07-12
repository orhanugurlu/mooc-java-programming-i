
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = scanner.nextLine();
            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (cmd.equals("add")) {    
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (cmd.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                String translation = dictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        
    }
    
}
