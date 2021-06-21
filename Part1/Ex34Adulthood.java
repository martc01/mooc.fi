import java.util.Scanner;

public class Ex34Adulthood {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int UserAgeInput = Integer.valueOf(scanner.nextLine());

        if (UserAgeInput >= 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }
    
        
    }
}
