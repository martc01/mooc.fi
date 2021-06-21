import java.util.Scanner;

public class Ex10PrintedTwice {
    public static void main(String[] args) {

        //Create the tool for reading, assign it to variable caller "Scanner"
        Scanner scanner = new Scanner(System.in);

        //Print user a message "Write a message: "
        System.out.println("Write a message:");

        //Read the user´s string input, save it to program memory
        //"String message = (user input)"
        String message = scanner.nextLine();

        // Print the user input twice
        System.out.println(message);
        System.out.println(message);
    }
}
