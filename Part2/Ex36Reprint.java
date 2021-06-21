import java.util.Scanner;

public class Ex36Reprint {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < input; i++){
            PrintText();
        }
    }

    public static void PrintText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}