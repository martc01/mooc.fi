import java.util.Scanner;

public class Ex40Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String FirstUserStringInput = scanner.nextLine();

        System.out.println("Enter the second string:");
        String SecondUserStringInput = scanner.nextLine();

      if (FirstUserStringInput.equals(SecondUserStringInput)) {
          System.out.println("Same");
    } else {
        System.out.println("Different");
    }
    }
}
