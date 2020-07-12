
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();
        
        UserInterface ui = new UserInterface(scan, database);
        ui.start();
    }

}
