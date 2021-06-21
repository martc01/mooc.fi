import java.util.Scanner;

public class Ex18IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        String UserInput = scanner.nextLine();
        System.out.println("You gave the number " + Integer.valueOf(UserInput));

        System.out.println("Give a number: ");
        String SecondUserInput = scanner.nextLine();
        System.out.println("You gave the number " + double.valueOf(SecondUserInput));

    }
}
