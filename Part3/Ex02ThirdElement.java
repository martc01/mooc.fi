import java.util.ArrayList;
import java.util.Scanner;

public class Ex02ThirdElement {
    
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numberList = new ArrayList<>();
            System.out.println("Input numbers.");    

            while (true) {
                
                int number = Integer.valueOf(scanner.nextLine());

                if (number == 0) {
                    break;
                }

                if (number < 0) {
                    System.out.println("Unfit number! Try again.");
                    continue;
                }

                numberList.add(number);
                continue;

        }
        int sum = numberList.get(1) + numberList.get(2);
        System.out.println(sum);

    }
}
