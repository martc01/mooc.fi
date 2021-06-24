package Part4.Ex19Books;

import java.util.ArrayList;
import java.util.Scanner;

public class sMain {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> bookCollection = new ArrayList<>();

        while(true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages  = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year  = Integer.valueOf(scanner.nextLine());
            

            bookCollection.add(new Books(bookTitle, pages, year));
        } 

        System.out.println();
        System.out.print("Program's maximum duration? ");
        String information = scanner.nextLine();
        
        for(Books _bookCollection : bookCollection) {
            if (information == "everything") {
                System.out.println(_bookCollection.toString());
            }

            if (information == "name") {
                System.out.println(_bookCollection.getTitle());
            }
        } 
    }
}