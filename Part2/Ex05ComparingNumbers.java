import java.util.Scanner;

public class Ex05ComparingNumbers {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int number1 = Integer.valueOf(reader.nextLine());

        int number2 = Integer.valueOf(reader.nextLine());


        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " is smaller than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
    }
}