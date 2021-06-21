import java.util.Scanner;

public class Ex12PositiveNumbers {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("Input positive numbers.");    
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }

            System.out.println("Your input was " + number);
            break;
        }
    }
}