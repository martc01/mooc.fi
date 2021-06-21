import java.util.Scanner;

public class Ex03TooMuch {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int number1 = Integer.valueOf(reader.nextLine());

        int number2 = Integer.valueOf(reader.nextLine());

        int sum = (number1 + number2);

        if (sum > 100) {
            System.out.println("too much");
        } else if (sum < 0) {
            System.out.println("too little");
        } else {
            System.out.println("ok");
        }
    }
}