import java.util.Scanner;

public class Ex20BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        String FirstUserInput = scanner.nextLine();
        System.out.println("True or false? " + Boolean.valueOf(FirstUserInput));


        System.out.println("Write something:");
        String SecondUserInput = scanner.nextLine();
        System.out.println("True or false? " + Boolean.valueOf(SecondUserInput));

    }
}
