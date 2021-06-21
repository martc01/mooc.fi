import java.util.Scanner;

public class Ex26Factorial {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: ");
       
        int firstNumber = Integer.valueOf(reader.nextLine());

        int tulos = 1;

        for (int i = 1; i <= firstNumber; i++) {
            tulos = tulos * i;
        }
        System.out.println("Factorial: " + tulos);
    }
}