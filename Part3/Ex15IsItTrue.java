import java.util.Scanner;
import java.util.Arrays;

public class Ex15IsItTrue {
        
            public static void main(String[] args){
                System.out.println("Give a word: ");
                
                Scanner scanner = new Scanner(System.in);
                String word1 = String.valueOf(scanner.nextLine());

                if ((word1.equals("true"))) {
                    System.out.println("You got it right!");
                } else {
                    System.out.println("it wasn´t");
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