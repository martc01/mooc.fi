import java.util.Scanner;

public class Ex20Average {
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

    double averageOfNumbers = (double) sumOfNumbers / countOfNumbers;

    System.out.println("Average of the numbers: " + averageOfNumbers);

    }
}