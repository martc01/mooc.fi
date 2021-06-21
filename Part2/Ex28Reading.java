import java.util.Scanner;

public class Ex28Reading{
    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Give numbers: ");
       
            int firstNumbers = Integer.valueOf(reader.nextLine());
        
            if (firstNumbers == -1){
                break;
            }

        } 
        
        System.out.println("Thx! Bye!");
    }
}