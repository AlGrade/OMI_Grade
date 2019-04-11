package Blatt2;

import java.util.ArrayList;

public class Book extends Medium {
    ArrayList<String> authors;
    String isbn;

    public Book(String title, String publisher, int year, ArrayList<String> authors, String isbn) {
        super("Book", title, publisher, year);
        this.authors = authors;
        this.isbn = isbn;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String printInfo(){
        String retString = "";

        retString += getId()+", "+getType()+", "+getTitle()+", "+getPublisher()+", "+getYear()+", "+getIsbn()+", "+getAuthors();

        return retString;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello. I'm a "+this.type);
    }

}
