
import java.util.Scanner;

public class UserInterface {
 
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = scanner.nextLine();
            if (cmd.equals("stop")) {
                break;
            } else if (cmd.equals("add")) {
                System.out.print("To add: ");
                String todo = scanner.nextLine();
                todoList.add(todo);
            } else if (cmd.equals("remove")) { 
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                todoList.remove(number);
            } else if (cmd.equals("list")) {
                todoList.print();
            }
        }
    }    
    
}
