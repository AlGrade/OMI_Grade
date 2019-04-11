package Blatt2;

import java.util.ArrayList;

public class EBook extends Book {
    String path;

    public EBook(String title, String publisher, int year, ArrayList<String> authors, String isbn, String path) {
        super(title, publisher, year, authors, isbn);
        this.setType("EBook");
        this.path = path;
    }

    //Getter, Setter:

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String printInfo(){
        String retString = "";

        retString += getId()+", "+getType()+", "+getTitle()+", "+getPublisher()+", "+getYear()+", "+getPath();

        return retString;
    }


}
