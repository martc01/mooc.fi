import java.time.Year;
import java.util.Scanner;

public class Ex42LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int YearUserNumberInput = Integer.valueOf(scanner.nextLine());

        if (YearUserNumberInput % 4 != 0) {
            System.out.println("This is not a leap year.");
        } else if ((YearUserNumberInput % 4 == 0) && (YearUserNumberInput % 100 == 0) && (YearUserNumberInput % 400 != 0)) {
            System.out.println("This is not a leap year.");
        } else {
            System.out.println("This is a leap year.");
        }
        
    }
}
