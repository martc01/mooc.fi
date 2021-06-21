import java.util.Scanner;

public class Ex19DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String FirstUserInput = scanner.nextLine();
        System.out.println("You gave the number " + Double.valueOf(FirstUserInput));


        System.out.println("Give a number:");
        String SecondUserInput = scanner.nextLine();
        System.out.println("You gave the number " + Double.valueOf(SecondUserInput));

    }
}
