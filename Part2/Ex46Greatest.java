import java.util.Scanner;

public class Ex46Greatest {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int third = Integer.valueOf(scanner.nextLine());

        int answer = greatest(first, second, third);
        
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {

        if (number1 > number2  && number1 > number3) {
            return number1;    
        } else if (number2 > number3  && number2 > number1) {
            return number2;
        } else {return number3;}
        }
}
