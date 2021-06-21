public class Ex50PrintSquares {
    public static void main(String[] main) {
        printSquare(4);
    }

    public static void printSquare (int max) {
        int number = 1;

        while (number <= max) {
            printStars(number, max);
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