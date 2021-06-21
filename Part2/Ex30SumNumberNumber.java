import java.util.Scanner;

public class Ex30SumNumberNumber {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int sumOfNumbers = 0;
        int countOfNumbers = 0;
        while (true) {
            
            System.out.println("Give numbers: ");
       
            int firstNumbers = Integer.valueOf(reader.nextLine());
        
            if (firstNumbers == -1){
                break;
            }

            if (firstNumbers != -1) {
                sumOfNumbers += firstNumbers;
                countOfNumbers += 1;
            }

        } 
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + countOfNumbers);

    }
}