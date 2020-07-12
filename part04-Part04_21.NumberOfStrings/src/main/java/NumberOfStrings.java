
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strCount = 0;
        
        while (true) {
            String str = scanner.nextLine();
            
            if (str.equals("end")) {
                break;
            }
            
            strCount++;
        }
        System.out.println(strCount);
    }
}
