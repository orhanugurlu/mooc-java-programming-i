
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDatabase database;

    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scanner = scanner;
        this.database = database;
    }
    
    public void start() {
        while (true) {
            System.out.println("? ");
            String cmd = scanner.nextLine();
            if (cmd.equals("Quit")) {
                break;
            } else if (cmd.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String nameInLatin = scanner.nextLine();
                database.add(new Bird(name, nameInLatin));
            } else if (cmd.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                Bird bird = database.findBird(name);
                if (bird == null) {
                    System.out.println("Not a bird!");
                } else {
                    bird.addObservation();
                }
            } else if (cmd.equals("One")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                Bird bird = database.findBird(name);
                if (bird == null) {
                    System.out.println("Not a bird!");
                } else {
                    System.out.println(bird);
                }
            } else if (cmd.equals("All")) {
                database.printAll();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    
}
