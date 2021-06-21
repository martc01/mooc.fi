public class Ex52PrintTriangle {
    public static void main(String[] main) {
        printTriangle(4);
    }

    public static void printTriangle (int size) {
        int number = 1;

        while (number <= size) {
            printStars(number, size);
            number++;
            // number = 1
            // number = 2
        }
    }

    public static void printStars(int number, int coefficient) {
        
        int printable = number;
        // printable = 1
        // printable = 2
        // printable = 3

        while (printable <= number * coefficient) {
            // 1 <= 1 * 4
            // 2 <= 2 * 4
            // 3 <= 12

            System.out.print("*");
            // printea una estrella y como 5 > 4, corta el loop.
            // printea una estrella, despues otra xq 6 < 8, y dsp corta xq 12 > 8.
            // print *, dsp otra xq 6 <12, dsp otra xq 10 <12, dsp corta

            printable +=coefficient;
            // printable = 1 + 4
            // printable = 2 + 4
        }

        System.out.println("");
    }

}