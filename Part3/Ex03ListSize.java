import java.util.ArrayList;
import java.util.Scanner;

public class Ex03ListSize {
    
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<>();


                String name = String.valueOf(scanner.nextLine());

                list.add(name);
                

        System.out.println("In total: " + list.size());    
    }
}
