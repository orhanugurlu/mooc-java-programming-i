
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] pieces = line.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }
    }
}
