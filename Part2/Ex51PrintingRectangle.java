public class Ex51PrintingRectangle {
    public static void main(String[] main) {
        printRectangle(17, 3);
    }

    public static void printRectangle (int width, int height) {
        int number = 1;

        while (number <= height) {
            printStars(number, width);
            number++;
        }
    }

    public static void printStars(int number, int coefficient) {
        
        int printable = number;
        while (printable <= number * coefficient) {
            System.out.print("*");
            printable +=number;
        }

        System.out.println("");
    }

}