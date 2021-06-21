import java.util.Arrays;
import java.util.Scanner;

public class Ex18AgeOldest {
        public static void main(String[] args){

                Scanner reader = new Scanner(System.in);
                int inputAge = 0;
                int oldestAge = 0;


                while(true) {
                        String input = reader.nextLine();
                        if (input.equals("")) {
                                break;
                        }

                        String[] parts = input.split(",");
                        inputAge = Integer.valueOf(parts[1]);
                        
                        if (inputAge > oldestAge) {
                                oldestAge = inputAge;
                        }
                }
                System.out.println(oldestAge);
                
                
        }
        
}
