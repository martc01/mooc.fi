import java.util.Scanner;

public class Ex44Summation {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the fourth number: ");
        int fourth = Integer.valueOf(scanner.nextLine());
        
        double sumResult = sum(first, second, third, fourth);
        
        System.out.println("Sum: " + sumResult);
    }

    public static double sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
}
