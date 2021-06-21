import java.util.Scanner;

public class Ex45Smallest {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        double smallestNumber = smallest(first, second);
        
        System.out.println("smallest: " + smallestNumber);
    }

    public static double smallest(int number1, int number2) {

        if (number1 < number2) {
            return number1;    
        } else {
            return number2;
        }
    }
}