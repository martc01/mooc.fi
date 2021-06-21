import java.util.ArrayList;

public class Ex04NumberOrder {
    
        public static void main(String[] args) {

            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);

            for (int i = 0; i < numbers.size(); i++) {
                int number = numbers.get(i);
                System.out.println(number);
            }

            System.out.println("");

            int index = numbers.size() - 1;
            while (index >= 0) {
                int number = numbers.get(index);
                System.out.println(number);
                index = index -1;
            }
    }
    
}
