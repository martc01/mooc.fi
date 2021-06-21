import java.util.Scanner;

public class Ex25SumSequence {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First number? ");
       
        int firstNumber = Integer.valueOf(reader.nextLine());

        System.out.println("Last number? ");

        int lastNumber = Integer.valueOf(reader.nextLine());

        int tulos = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            tulos += i;
        }
        System.out.println("The sum is " + tulos);
    }
}