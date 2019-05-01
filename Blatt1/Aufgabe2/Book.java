package Blatt1.Aufgabe2;

import java.util.ArrayList;

public class Book {
    private long id;
    private String title;
    private ArrayList<String> authors;
    private String publisher;
    private int year;
    private String isbn;

    public Book(long id){
        this.id = id;
        this.authors = new ArrayList<>();
        this.publisher = "";
        this.isbn = "";
        this.year = Integer.MAX_VALUE;
    }

    public void addAuthor(String author){
        authors.add(author);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
