
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Statistics statistics;

    public UserInterface(Scanner scanner, Statistics statistics) {
        this.scanner = scanner;
        this.statistics = statistics;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                break;
            }
            statistics.addPoint(value);
        }
        System.out.println("Point average (all): " + statistics.average());
        System.out.println("Point average (passing): " + statistics.averagePassing());
        System.out.println("Pass percentage: " + statistics.passPercentage());
        statistics.printDistribution();
    }
    
}
