import java.util.Scanner;

public class Ex31Orwell {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int UserNumberInput = Integer.valueOf(scanner.nextLine());

        if (UserNumberInput == 1983) {
            System.out.println("Orwell");
        }
        else {
            System.out.println("Not Orwell");
        }
    
        
    }
}
