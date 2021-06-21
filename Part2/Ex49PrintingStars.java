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