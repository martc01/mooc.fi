import java.time.Year;
import java.util.Scanner;

public class Ex43GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double ValueUserInput = Double.valueOf(scanner.nextLine());

        if (ValueUserInput >= 1000000) {
            System.out.println("Tax: " + (ValueUserInput-1000000)*0.17+142100);
        } else if (ValueUserInput >= 200000) {
            System.out.println("Tax: " + ((ValueUserInput-200000)*0.15+22100));
        } else if (ValueUserInput >= 55000) {
            System.out.println("Tax: " + ((ValueUserInput-55000)*0.12+4700));
        } else if (ValueUserInput >= 25000) {
            System.out.println("Tax: " + ((ValueUserInput-25000)*0.10+1700));
        } else if (ValueUserInput >= 5000) {
            System.out.println("Tax: " + ((ValueUserInput-5000)*0.08+100));
        } else {
            System.out.println("No tax!");
        }
        
    }
}
