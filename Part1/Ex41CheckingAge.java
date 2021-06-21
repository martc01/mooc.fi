import java.util.Scanner;

public class Ex41CheckingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int AgeUserNumberInput = Integer.valueOf(scanner.nextLine());

        if (AgeUserNumberInput > 0 && AgeUserNumberInput < 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
