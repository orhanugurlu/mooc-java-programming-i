
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String name = "";
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] pieces = line.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > maxAge) {
                maxAge = age;
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
