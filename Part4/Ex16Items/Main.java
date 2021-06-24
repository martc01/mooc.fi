package Part4.Ex16Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();

        while(true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            Items item = new Items(name);
            items.add(item);
        } 
        
        for(Items item: items) {
            System.out.println(item);
        }
    }
}
