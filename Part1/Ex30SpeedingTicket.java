import java.util.Scanner;

public class Ex30SpeedingTicket {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give Speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
        else {
            System.out.println("cool");
        }
    
        
    }
}
