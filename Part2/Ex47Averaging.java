import java.util.Scanner;

public class Ex47Averaging {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the third number: ");
        int fourth = Integer.valueOf(scanner.nextLine());

        double result = average(first, second, third, fourth);
        System.out.println("Average: " + result);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        return sum(number1, number2, number3, number4)/4.0;
    }
}