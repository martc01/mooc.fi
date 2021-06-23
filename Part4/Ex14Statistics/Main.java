package Part4.Ex14Statistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();

        Scanner reader = new Scanner(System.in);
        
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();

        System.out.println("Enter numbers:");
        
        while(true){
            int number = Integer.valueOf(reader.nextLine());

           if (number == -1) {
            break;
            }
            statistics.addNumber(number);

            if (number % 2 == 0) {
                evens.addNumber(number);
            } else {
                odds.addNumber(number);
            }
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum: " + evens.sum());
        System.out.println("Average: " + odds.average());

    }
}
