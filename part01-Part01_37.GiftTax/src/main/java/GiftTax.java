
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        double tax = 0.0;
        double minTax = 0.0;
        double lowLimit = 0.0;
        double rate = 0.0;
        
        if (giftValue > 1000000) {
            minTax = 142100;
            lowLimit = 1000000;
            rate = 0.17;
        } else if (giftValue > 200000) {
            minTax = 22100;
            lowLimit = 200000;
            rate = 0.15;
        } else if (giftValue > 55000) {
            minTax = 4700;
            lowLimit = 55000;
            rate = 0.12;
        } else if (giftValue > 25000) {
            minTax = 1700;
            lowLimit = 25000;
            rate = 0.1;
        } else if (giftValue > 5000) {
            minTax = 100;
            lowLimit = 5000;
            rate = 0.08;
        }            

        tax = minTax + (giftValue - lowLimit) * rate; 
        
        if (tax == 0.0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
        
    }
}
