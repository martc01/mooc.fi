package Part5.Ex02Book;

public class Main {
    public static void main (String[] args){
    String author = "J. K. Rowling";
    String name = "Harry Potter and the Sorcerer's Stone";
    int pages = 223;
    Book book = new Book(author, name, pages);

    System.out.println(book);

    }
}