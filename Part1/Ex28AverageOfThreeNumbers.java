import java.util.Scanner;

public class Ex28AverageOfThreeNumbers {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        double converter = 1.0;        
        double average = (double) (((first + second + third)*converter/(first/first + second/second + third/third)));

        System.out.println("The average is " + average);

    }
}
