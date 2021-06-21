import java.util.Arrays;
import java.util.Scanner;

public class Ex19NameOldest {
        public static void main(String[] args){

                Scanner reader = new Scanner(System.in);
                int inputAge = 0;
                int oldestAge = 0;
                String inputName = null;
                String oldestName = null;

                while(true) {
                        String input = reader.nextLine();
                        if (input.equals("")) {
                                break;
                        }
                        
                        String[] parts = input.split(",");
                        inputAge = Integer.valueOf(parts[1]);
                        inputName = String.valueOf(parts[0]);

                        if (inputAge > oldestAge) {
                                oldestAge = inputAge;
                                oldestName = inputName;

                        }
                }
                System.out.println(oldestName);

                        
                
        }
        
}
