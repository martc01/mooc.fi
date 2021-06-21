import java.util.Scanner;

public class Ex08Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a message: ");

        String UserInput = scanner.nextLine();

        System.out.println(UserInput);
    }
}