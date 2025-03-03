import java.lang.constant.Constable;

public class Book {
    private String title, author, ISBN;
    private double price;

    //constructors
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    //overloading methods
    public String getBookDetails(){
        String s = "Title: " +title+ ",Author: " +author+ ",ISBN " +ISBN+ ",Price: " +price;
        return s;
    }

    public String getBookDetails(String ISBN){
        if(this.ISBN.equals(ISBN)){
            return getBookDetails();
        }
        else{
            String e = "Not found this type of ISBN.";
            return e;
        }
    }
}

