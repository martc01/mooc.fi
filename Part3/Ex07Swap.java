import java.util.Scanner;

public class Ex07Swap {
        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            int[] numbers = new int[5];
            numbers[0] = 1;
            numbers[1] = 3;
            numbers[2] = 5;
            numbers[3] = 7;
            numbers[4] = 9;

            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
            System.out.println();

            System.out.println("Give two indices to Swap");
            int indexSwap1 = Integer.valueOf(reader.nextLine());
            int indexSwap2 = Integer.valueOf(reader.nextLine());

            int numberSwap1 = numbers[indexSwap1];
            int numberSwap2 = numbers[indexSwap2];

            numbers[indexSwap1] = numberSwap2;
            numbers[indexSwap2] = numberSwap1;

            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
            System.out.println();


            /*
            int SwapPivot1 = numberSwap1;
            int SwapPivot2 = numberSwap2;

            numbers[numberSwap2] = SwapPivot1;
            numbers[numberSwap1] = SwapPivot2;
            

            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
*/
            
        }
}

