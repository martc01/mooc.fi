import java.util.Scanner;

public class Ex07CarryOn {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                break;
            }

        }

    }
}