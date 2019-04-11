package Blatt2;

import java.util.ArrayList;

public class Video extends Medium{
    ArrayList<String> actors;
    String director;

    public Video(String title, String publisher, int year, ArrayList<String> actors, String director) {
        super("Video", title, publisher, year);
        this.actors = actors;
        this.director = director;
    }

    //Getter, Setter:

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String printInfo(){
        String retString = "";

        retString += getId()+", "+getType()+", "+getTitle()+", "+getPublisher()+", "+getYear()+", "+getActors()+", "+getDirector();

        return retString;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello. I'm a "+this.type);
    }
}
