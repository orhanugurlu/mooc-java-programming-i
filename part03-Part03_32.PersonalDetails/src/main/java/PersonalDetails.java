
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageSum = 0;
        int count = 0;
        String longestName = "";
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] pieces = line.split(",");
            ageSum += Integer.valueOf(pieces[1]);
            count++;
            if (pieces[0].length() > longestName.length()) {
                longestName = pieces[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * ageSum / count));

    }
}
