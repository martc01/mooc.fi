import java.util.Scanner;

public class Ex24WhereToFrom {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Where to? ");
        
        int numberFromUserTo = Integer.valueOf(reader.nextLine());

        System.out.println("Where from? ");
        
        int numberFromUserFrom = Integer.valueOf(reader.nextLine());

        for (int i = numberFromUserFrom; i <= numberFromUserTo; i++) {
            System.out.println(i);
        }
    }
}