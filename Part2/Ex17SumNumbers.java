import java.util.Scanner;

public class Ex17SumNumbers {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;

            while (true) {

                System.out.println("Give a number (0 exits):");    
                int number = Integer.valueOf(scanner.nextLine());
                            
                if (number == 0) {
                    break;
                } 
                
                if (number != 0) {
                    numbers = numbers + number;
                } 
                                
        }
        System.out.println("Sum of the numbers: " + numbers);

    }
}