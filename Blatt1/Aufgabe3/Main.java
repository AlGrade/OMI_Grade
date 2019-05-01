package Blatt1.Aufgabe3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookAdministration administration = new BookAdministration();

        ArrayList<String> authors1 = new ArrayList<>();
        ArrayList<String> authors2 = new ArrayList<>();

        authors1.add("Max Müller");
        authors1.add("Max Mustermann");

        administration.addBook( "title1", authors1, "publisher1", 2000, "1");
        administration.addBook( "title2", authors1, "publisher2", 2001, "2");
        administration.addBook( "title3", authors2, "publisher3", 2002, "3");
        administration.addBook( "title4", authors1, "publisher4", 2001, "4");


        //System.out.println(administration.getBook(2));
        System.out.println(administration.getBook(4));

        //System.out.println(administration.search("Max Mustermann"));



    }
}
