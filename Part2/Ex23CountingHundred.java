import java.util.Scanner;

public class Ex23CountingHundred {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        System.out.println("wanna count?: ");
        
        int numberFromUser = Integer.valueOf(reader.nextLine());

        for (int i = numberFromUser; i <= 100; i++) {
            System.out.println(i);
        }
    }
}