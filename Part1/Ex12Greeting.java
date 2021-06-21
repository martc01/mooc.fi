import java.util.Scanner;

public class Ex12Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Write your program here
        
        System.out.println("What´s your name?");
        String UserInput = scanner.nextLine();
        System.out.println("Hi " + UserInput);
        

    }
}