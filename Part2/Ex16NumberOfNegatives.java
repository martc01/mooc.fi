import java.util.Scanner;

public class Ex16NumberOfNegatives {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        int ones = 0;

            while (true) {

                System.out.println("Input a number (0 exits):");    
                int number = Integer.valueOf(scanner.nextLine());
                            
                if (number == 0) {
                    break;
                } 
                
                if (number < 0) {
                    ones = ones + 1;
                } 
                
                System.out.println("Number of negative numbers: " + ones);
                
        }
    }
}