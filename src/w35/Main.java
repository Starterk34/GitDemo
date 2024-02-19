package w35;

import java.util.ArrayList;

import static w35.Book.bookList;

public class Main {
    public static void main (String[] args){
      Book book1 = new Book ("DaVinchi Code", "Dan Brown", "0123456789012");
      Book book2 = new Book ("Portrait of Dorian Gray", "Oskar Wild", "9876543210987");
      Book book3 = new Book ("Gateway of Europe", "Serhiy Plokhiy", "7777777777777");
      Book book4 = new Book ("Catcher in the rye", "Jerome David Salinger", "3434343434347");
      Book.addBook(book1);
      Book.addBook(book2);
      System.out.println("Before:");
      for (Book book : bookList){
          System.out.println(book.getTitle() + " written by " + book.getAuthor() + " has ISBN " + book.getISBN());
      }
      Book.removeBook(book1);
      Book.removeBook(book2);
      Book.addBook(book3);
      Book.addBook(book4);

      System.out.println("After:");
        for (Book book : bookList){
            System.out.println(book.getTitle() + " written by " + book.getAuthor() + " has ISBN " + book.getISBN());
        }

    }
}
