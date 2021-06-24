package Part4.Ex19Books;

public class Books {
    private String title;
    private int pages;
    private int year;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
