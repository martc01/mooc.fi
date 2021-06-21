public class Ex38FromParameterToOne {
    public static void main(String[] main) {
    
        printUntilNumber(5);
        printUntilNumber(2);
        }

    public static void printUntilNumber(int fromNumber) {
        int i = fromNumber;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}