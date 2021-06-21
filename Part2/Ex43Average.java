import java.util.Scanner;

public class Ex43Average {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
        
        double averageResult = average(first, second, third);
        
        System.out.println("The average of the numbers: " + averageResult);
    }

    public static double average(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        double avg = sum / 3.0;
    
        return avg;
    }
}
