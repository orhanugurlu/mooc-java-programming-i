
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                first.add(amount);
            } else if (input.startsWith("move")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                if (amount > first.contains()) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            } else if (input.startsWith("remove")) {
                int amount = Integer.valueOf(input.split(" ")[1]);
                second.remove(amount);
            }
        }
   }

}
