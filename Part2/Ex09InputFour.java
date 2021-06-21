import java.util.Scanner;

public class Ex09InputFour {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("Give a number: ");    
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 4) {
                break;
            }
        }
    }
}