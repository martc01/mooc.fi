import java.util.Scanner;

public class Ex21DifferentTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a String:");
        String FirstUserInput = scanner.nextLine();
        
        System.out.println("Give an integer:");
        String SecondUserInput = scanner.nextLine();
       
        System.out.println("Give a double:");
        String ThirdUserInput = scanner.nextLine();
       
        System.out.println("Give a boolean:");
        String FourthUserInput = scanner.nextLine();
       
        System.out.println("You gave the string " + String.valueOf(FirstUserInput));
        System.out.println("You gave the integer " + Integer.valueOf(SecondUserInput));
        System.out.println("You gave the double " + Double.valueOf(ThirdUserInput));
        System.out.println("You gave the boolean " + Boolean.valueOf(FourthUserInput));

        System.out.println("Give a String:");
        String FifthUserInput = scanner.nextLine();
        
        System.out.println("Give an integer:");
        String SixthUserInput = scanner.nextLine();
       
        System.out.println("Give a double:");
        String SeventhUserInput = scanner.nextLine();
       
        System.out.println("Give a boolean:");
        String EighthUserInput = scanner.nextLine();
       
        System.out.println("You gave the string " + String.valueOf(FifthUserInput));
        System.out.println("You gave the integer " + Integer.valueOf(SixthUserInput));
        System.out.println("You gave the double " + Double.valueOf(SeventhUserInput));
        System.out.println("You gave the boolean " + Boolean.valueOf(EighthUserInput));
    }
}
