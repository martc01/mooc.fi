import java.util.Scanner;

public class Ex33Positivity {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int UserNumberInput = Integer.valueOf(scanner.nextLine());

        if (UserNumberInput > 0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is not positive");
        }
    
        
    }
}
