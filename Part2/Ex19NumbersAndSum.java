import java.util.Scanner;

public class Ex19NumbersAndSum {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

    int countOfNumbers = 0;
    int sumOfNumbers = 0;

    while (true) {
        System.out.println("Give a number (0 to stop): ");
        
        int numberFromUser = Integer.valueOf(reader.nextLine());

        if (numberFromUser == 0) {
            break;
        }

        if (numberFromUser != 0) {
            countOfNumbers = countOfNumbers + 1;
            sumOfNumbers = numberFromUser + sumOfNumbers;
        }
    }

    System.out.println("Count of numbers: " + countOfNumbers);

    System.out.println("Sum of numbers: " + sumOfNumbers);

    }
}