public class Ex08Length {
        public static void main(String[] args) {

            int[] numbers = new int[4];
            numbers[0] = 42;
            numbers[1] = 13;
            numbers[2] = 12;
            numbers[3] = 7;
            
            System.out.println("The array has " + numbers.length + " elements.");

            int index = 0;
            while (index < numbers.length) {
                System.out.println(numbers[index]);
                index = index + 1;
            }
        }
}

