import java.util.Scanner;

public class Ex11PositiveInteger {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("Insert positive integers");    
            int number = Integer.valueOf(scanner.nextLine());
            if (number <= 0) {
                System.out.println("Unfit number! Try Again.");
                continue;
            }

            System.out.println("Your input was " + number);
            break;
        }
    }
}