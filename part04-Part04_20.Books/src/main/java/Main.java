import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Title: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String option = scanner.nextLine();
        
        for (Book book : books) {
            if (option.equals("everything")) {
                System.out.println(book);
            }
            if (option.equals("name")) {
                System.out.println(book.title());
            }
        }
        
    }
}
