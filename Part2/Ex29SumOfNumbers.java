import java.util.Scanner;

public class Ex29SumOfNumbers {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int sumOfNumbers = 0;
        while (true) {
            
            System.out.println("Give numbers: ");
       
            int firstNumbers = Integer.valueOf(reader.nextLine());
        
            if (firstNumbers == -1){
                break;
            }

            if (firstNumbers != -1) {
                sumOfNumbers += firstNumbers;
            }

        } 
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfNumbers);

    }
}