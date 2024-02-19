package w35;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    public Book (String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public static ArrayList<Book> bookList = new ArrayList<>();
    public static void addBook (Book book){
        bookList.add(book);
    }
    public static void removeBook(Book book){
        bookList.remove(book);
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getISBN(){
        return ISBN;
    }
}
