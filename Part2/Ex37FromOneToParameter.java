import java.util.Scanner;

public class Ex37FromOneToParameter {
    public static void main(String[] main) {
    
        printUntilNumber(5);
        printUntilNumber(2);
        }

    public static void printUntilNumber(int toNumber) {
        int i = 1;
        while (i <= toNumber) {
            System.out.println(i);
            i++;
        }
    }
}