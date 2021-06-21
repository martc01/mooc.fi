import java.util.Scanner;

public class Ex18ReadNumbers {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

    int numberOfPositives = 0;
    int numberOfNegatives = 0;

    while (true) {
        System.out.println("Give a number (0 to stop): ");
        
        int numberFromUser = Integer.valueOf(reader.nextLine());

        if (numberFromUser == 0) {
            break;
        }

        if (numberFromUser > 0) {
            numberOfPositives = numberOfPositives + 1;
        }

        if (numberFromUser < 0) {
            numberOfNegatives = numberOfNegatives + 1;
        }
    }

    System.out.println("Positive numbers: " + numberOfPositives);

    System.out.println("Negative numbers: " + numberOfNegatives);

    if (numberOfPositives + numberOfNegatives > 0) {
        double percentageOfPositives = 100.0 * numberOfPositives / (numberOfPositives + numberOfNegatives);
        System.out.println("Percentage of positive numbers: " + percentageOfPositives + "%");
    }

    }
}