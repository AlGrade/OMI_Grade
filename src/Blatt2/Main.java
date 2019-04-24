package Blatt2;

import java.util.ArrayList;

import static Blatt2.MediaAdministation.archive;

public class Main {
    public static void main(String[] args) {

        ArrayList authors = new ArrayList();
        Book b = new Book("t1", "p1", 1, authors, "12");

        ArrayList actors = new ArrayList();
        Video v = new Video("t2", "p2", 2000, actors, "d1");

        ArrayList songs = new ArrayList();
        CD c = new CD("t3", "p3", 2019, "i1", songs, 30);

        ArrayList authors2 = new ArrayList();
        EBook eb = new EBook("t4", "p4", 2001, authors2, "123", "path");

        ArrayList<Medium> medium = new ArrayList<>();

        //MediaAdministation archive = new MediaAdministation(medium);

        MediaAdministation.getInstance(medium);

        archive.addMedium(b);
        archive.addMedium(v);
        archive.addMedium(c);
        archive.addMedium(eb);

    }

    private static void printSpecialFields(MediaAdministation mediaAdmin){
        for(Medium m : mediaAdmin.getMediaArchive()){
            if(m instanceof Book){
                System.out.println(((Book) m).getIsbn());
            }
            if(m instanceof EBook){
                System.out.println(((EBook) m).getPath());
            }
            if(m instanceof CD){
                System.out.println(((CD) m).getDuration());
            }
            if(m instanceof Video){
                System.out.println(((Video) m).getDirector());
            }
        }
    }
}
