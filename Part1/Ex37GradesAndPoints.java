import java.util.Scanner;

public class Ex37GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]");
        int GradeUserNumberInput = Integer.valueOf(scanner.nextLine());

      if (GradeUserNumberInput < 0) {
          System.out.println("Grade: impossible!");
    } else if (GradeUserNumberInput <= 49) { 
          System.out.println("Grade: failed");
    } else if (GradeUserNumberInput <= 59) { 
        System.out.println("Grade: 1");
    } else if (GradeUserNumberInput <= 69) { 
        System.out.println("Grade: 2");
    } else if (GradeUserNumberInput <= 79) { 
        System.out.println("Grade: 3");
    } else if (GradeUserNumberInput <= 89) { 
        System.out.println("Grade: 4");
    } else if (GradeUserNumberInput <= 100) { 
        System.out.println("Grade: 5");
    } else {
        System.out.println("incredible!");
    }
    }
}
