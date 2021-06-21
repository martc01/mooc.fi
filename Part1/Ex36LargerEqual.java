import java.util.Scanner;

public class Ex36LargerEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int FirstUserNumberInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a second number:");
        int SecondUserNumberInput = Integer.valueOf(scanner.nextLine());
        
      if (FirstUserNumberInput > SecondUserNumberInput) {
          System.out.println("Greater number is: " + FirstUserNumberInput);
      } else {
          System.out.println("Greater number is: " + SecondUserNumberInput);
      }
    }
}
