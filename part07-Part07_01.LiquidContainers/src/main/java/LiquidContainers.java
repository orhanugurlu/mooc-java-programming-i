
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("First", 0);
        Container second = new Container("Second", 0);

        while (true) {
            System.out.println(first);
            System.out.println(second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                first.addAmount(amount);
            } else if (input.startsWith("move")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                int actualAmountToMove = first.removeAmount(amount);
                second.addAmount(actualAmountToMove);
            } else if (input.startsWith("remove")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                second.removeAmount(amount);
            }
        }
    }

}
