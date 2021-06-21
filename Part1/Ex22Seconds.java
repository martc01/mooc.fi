import java.util.Scanner;

public class Ex22Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave " + number1*24*60*60);

        System.out.println("How many days would you like to convert to seconds?");
        int number2 = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave " + number2*24*60*60);

        System.out.println("How many days would you like to convert to seconds?");
        int number3 = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave " + number3*24*60*60);

    }
}
