import java.util.Scanner;
import java.util.Arrays;

public class Ex14PrintThrice {
        
        public static void printThrice(String theWord) {

                System.out.print(theWord);
                System.out.print(theWord);
                System.out.print(theWord);
                
                System.out.println("");
            }
        
            public static void main(String[] args){
                System.out.println("Give a word: ");
                System.out.println("");

                Scanner scanner = new Scanner(System.in);
                String word1 = String.valueOf(scanner.nextLine());

                printThrice(word1);
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