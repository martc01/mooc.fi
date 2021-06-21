import java.util.Scanner;

public class Ex22Counting {
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

    int counting = 0;
        System.out.println("wanna count?: ");
        
        int numberFromUser = Integer.valueOf(reader.nextLine());

        for (int i = 0; i <= numberFromUser; i++) {
            System.out.println(i);
        }
    }
}