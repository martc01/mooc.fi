import java.util.Scanner;

public class Ex02SquareRootOfSum {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int number1 = Integer.valueOf(reader.nextLine());

        int number2 = Integer.valueOf(reader.nextLine());

        int sum = (number1 + number2);

        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}