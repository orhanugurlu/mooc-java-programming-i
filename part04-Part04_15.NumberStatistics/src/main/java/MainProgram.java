
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Statistics allStat = new Statistics();
        Statistics evenStat = new Statistics();
        Statistics oddStat = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            allStat.addNumber(number);
            if (number % 2 == 0) {
                evenStat.addNumber(number);
            } else {
                oddStat.addNumber(number);
            }
        }
        System.out.println("Sum: " + allStat.sum());
        System.out.println("Sum of even numbers: " + evenStat.sum());
        System.out.println("Sum of odd numbers: " + oddStat.sum());
    }
}
