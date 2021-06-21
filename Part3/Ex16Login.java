import java.util.Scanner;
import java.util.Arrays;

public class Ex16Login {
        
            public static void main(String[] args){
                System.out.print("Enter username: ");
                
                Scanner scanner1 = new Scanner(System.in);
                String username = String.valueOf(scanner1.nextLine());


                System.out.print("Enter password: ");
                
                Scanner scanner2 = new Scanner(System.in);
                String password = String.valueOf(scanner2.nextLine());

                if (((username.equals("alex")) && (password.equals("sunshine"))) || ((username.equals("emma")) && (password.equals("haskell"))))  {
                    System.out.println("You have successfully logged in!");
                } else {
                    System.out.println("incorrect username or password!");
                }
                
            }
}

/*
public class Ex49PrintingStars {
    
        public static void printStars(int number) {
    
            int printable = 1;
            while (printable <= number) {
                System.out.print("*");
                printable++;
            }
    
            System.out.println("");
        }
        
        public static void main(String[] main) {
            printStars(5);
            printStars(3);
            printStars(9);
        }
    }
*/