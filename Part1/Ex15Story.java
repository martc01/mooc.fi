import java.util.Scanner;

public class Ex15Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String UserInputCharName = scanner.nextLine();
        System.out.println("What is their job?");
        String UserInputCharJob = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + UserInputCharName + ", who was " + UserInputCharJob + ".");
        System.out.println("On the way to work, " + UserInputCharName + " reflected on life.");
        System.out.println("Perhaps " + UserInputCharName + " will not be " + UserInputCharJob + " forever.");
        }
}