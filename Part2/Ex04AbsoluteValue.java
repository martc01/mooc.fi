import java.util.Scanner;

public class Ex04AbsoluteValue {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int number1 = Integer.valueOf(reader.nextLine());


        int sum = (number1 * -1);

        if (number1 <= 0) {
            System.out.println(sum);
        } else {
            System.out.println(number1);
        }
    }
}