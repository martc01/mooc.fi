import java.util.Scanner;

public class Ex32EvenOdd {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int sumOfNumbers = 0;
        int countOfNumbers = 0;
        int EvenNumbers = 0;
        int OddNumbers = 0;

        System.out.println("Give numbers: ");

        while (true) {
                   
            int firstNumbers = Integer.valueOf(reader.nextLine());
        
            if (firstNumbers == -1){
                break;
            }

            if (firstNumbers != -1  && firstNumbers%2 == 0 ) {
                sumOfNumbers += firstNumbers;
                countOfNumbers += 1;
                EvenNumbers += 1;
            } else {
                sumOfNumbers += firstNumbers;
                countOfNumbers += 1;
                OddNumbers += 1;
            }
        } 
        
        double averageOfNumbers = (double) sumOfNumbers / countOfNumbers;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + countOfNumbers);
        System.out.println("Average: " + averageOfNumbers);
        System.out.println("Even: " + EvenNumbers);
        System.out.println("Odd: " + OddNumbers);

    }
}