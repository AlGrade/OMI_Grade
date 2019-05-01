package Blatt1.Aufgabe2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookAdministration administration = new BookAdministration();

        ArrayList<String> authors1 = new ArrayList<>();

        administration.addBook(1, "title1", authors1, "publisher1", 2000, "1");
        administration.addBook(2, "title2", authors1, "publisher2", 2001, "2");
        administration.addBook(3, "title3", authors1, "publisher3", 2002, "3");
        administration.addBook(4, "title4", authors1, "publisher4", 2003, "4");


        System.out.println(administration.getBook(2));
        System.out.println(administration.getBook(5));

    }
}
