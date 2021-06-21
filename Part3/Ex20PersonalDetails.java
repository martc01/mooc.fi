import java.util.Arrays;
import java.util.Scanner;

public class Ex20PersonalDetails {
        public static void main(String[] args){

                Scanner reader = new Scanner(System.in);
                int inputYear = 0;
                int inputLength = 0;
                int sum = 0;
                int count = 0;
                String inputName = null;
                String longestName = null;
                int longName = 0;
                

                while(true) {
                        String input = reader.nextLine();
                        if (input.equals("")) {
                                break;
                        }
                        
                        String[] parts = input.split(",");
                        inputYear = Integer.valueOf(parts[1]);
                        inputName = String.valueOf(parts[0]);
                        inputLength = inputName.length();

                        sum = sum + inputYear;
                        count = count + 1;

                        if (inputLength > longName) {
                                longName = inputLength;
                                longestName = inputName;
                        }
                }
                double average = (double) sum / count; 
                
                System.out.println(longestName);
                System.out.println(average);

                        
                
        }
        
}
