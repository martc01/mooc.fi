import java.util.Scanner;

public class Ex13aOnlyPositives {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");    
            int number = Integer.valueOf(scanner.nextLine());
                        
            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Unfit number");
                continue;
            } 
              
            System.out.println(number * number);
            
        }
    }
}