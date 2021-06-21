import java.util.Scanner;

public class Ex32Ancient {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int UserYearInput = Integer.valueOf(scanner.nextLine());

        if (UserYearInput < 2015) {
            System.out.println("Ancient History!");
        }
        else {
            System.out.println("Not Ancient History");
        }
    
        
    }
}
