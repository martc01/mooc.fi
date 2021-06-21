import java.util.Scanner;

public class Ex01Squared {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        int number = Integer.valueOf(reader.nextLine());

        int square = number * number;

        System.out.println(square);
    }
}