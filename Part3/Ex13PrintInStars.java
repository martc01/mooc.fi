import java.util.Arrays;

public class Ex13PrintInStars {
        public static void main(String[] args){
                
                Integer [] numbers = {5, 1, 3, 4, 2};
               
                int index = 0;
                while (index < numbers.length) {
                    printStars(numbers[index]);
                    index = index + 1;
                }
        }

        public static void printStars(int number) {
    
                int printable = 1;
                while (printable <= number) {
                    System.out.print("*");
                    printable++;
                }
        
                System.out.println("");
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