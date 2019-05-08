package Blatt1.Aufgabe2;

import java.util.ArrayList;

public class BookAdministration {
    private ArrayList<Book> books;

    public BookAdministration() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(long id, String title, ArrayList<String> authors, String publisher, int year, String isbn) {
        Book b = new Book(id);
        b.setAuthors(authors);
        b.setIsbn(isbn);
        b.setPublisher(publisher);
        b.setTitle(title);
        b.setYear(year);

        for (Book x : books) {
            if (x.getId() == b.getId()) {
                System.err.println("isbn is used");
                return false;
            }
        }
        books.add(b);
        return true;
    }

    public String getBook(long id) {
        String retString = "";

        for (Book b : books) {
            if (id == b.getId()) {
                retString += b.getId()+"; "+b.getAuthors()+"; "+b.getPublisher()+"; "+b.getYear()+"; "+b.getIsbn();
                return retString;
            }
        }
        return "not found";
    }

}