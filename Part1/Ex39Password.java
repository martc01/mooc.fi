import java.util.Scanner;

public class Ex39Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password?");
        String PasswordUserNumberInput = scanner.nextLine();

      if (PasswordUserNumberInput.equals("Caput Draconis")) {
          System.out.println("Welcome!");
    } else {
        System.out.println("Off with you!");
    }
    }
}
