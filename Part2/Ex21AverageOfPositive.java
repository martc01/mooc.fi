import java.util.Scanner;

public class Ex21AverageOfPositive {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

    int countOfPositiveNumbers = 0;
    int sumOfPositiveNumbers = 0;

    while (true) {
        System.out.println("Give a number (0 to stop): ");
        
        int numberFromUser = Integer.valueOf(reader.nextLine());

        if (numberFromUser == 0) {
            break;
        }

        if (numberFromUser > 0) {
            countOfPositiveNumbers = countOfPositiveNumbers + 1;
            sumOfPositiveNumbers = numberFromUser + sumOfPositiveNumbers;
        }
    }

    double averageOfNumbers = (double) sumOfPositiveNumbers / countOfPositiveNumbers;

    if (countOfPositiveNumbers <= 0) {
        System.out.println("Cannot calculate the average");
    } else {
    System.out.println("Average of the numbers: " + averageOfNumbers);
        }
    }
}