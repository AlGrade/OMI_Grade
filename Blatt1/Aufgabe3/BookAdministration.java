package Blatt1.Aufgabe3;

import java.util.ArrayList;

public class BookAdministration {
    private ArrayList<Book> books;
    private static long nextId = 0;

    public BookAdministration() {
        this.books = new ArrayList<>();
    }

    private static long getNextId(){
        nextId++;
        return nextId;
    }

    public boolean addBook(String title, ArrayList<String> authors, String publisher, int year, String isbn) {
        Book b = new Book(getNextId());
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

    public ArrayList <Integer> search(String author){
        ArrayList<Integer> retList = new ArrayList<>();

        for(Book b : books){
            for(String s : b.getAuthors()){
                if(author.equals(s)){
                    retList.add((int)b.getId());
                }
            }
        }
        return retList;
    }

    public ArrayList <Integer> search (int year){
        ArrayList<Integer> retList = new ArrayList<>();

        for(Book b : books){
            if(year == b.getYear()){
                retList.add((int)b.getId());
            }
        }
        return retList;
    }

    /*public ArrayList <Integer> search(String publisher){   Nein, da die Methode mit gleichem Parameter schon definiert wurde
        ArrayList<Integer> retList = new ArrayList<>();

        for(Book b : books){
            if(publisher.equals(b.getPublisher())){
                retList.add((int)b.getId());
            }
        }
        return retList;
    }*/
}
