import java.util.Scanner;

public class Ex38OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points number");
        int NumberUserNumberInput = Integer.valueOf(scanner.nextLine());

    int EvenCalculator = NumberUserNumberInput % 2;

      if (EvenCalculator == 0) {
          System.out.println("Even!");
    } else {
        System.out.println("Odd");
    }
    }
}
