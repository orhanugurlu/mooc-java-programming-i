
public class YourFirstAccount {

    public static void main(String[] args) {
        // Write a program that creates an account with a balance of 100.0,
        Account account = new Account("Orhan", 100.0);
        // deposits 20.0 in it
        account.deposit(20.0);
        // and finally prints the balance.
        System.out.println(account);
    }
}
