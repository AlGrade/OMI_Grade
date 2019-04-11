package Blatt2;

import java.util.ArrayList;

public class CD extends Medium {
    String interpret;
    ArrayList<String> songs;
    long duration;

    public CD(String title, String publisher, int year, String interpret, ArrayList<String> songs, long duration) {
        super("CD", title, publisher, year);
        this.interpret = interpret;
        this.songs = songs;
        this.duration = duration;
    }

    //Getter, Setter:


    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String printInfo(){
        String retString = "";

        retString += getId()+", "+getType()+", "+getTitle()+", "+getPublisher()+", "+getYear()+", "+getInterpret()+", "+getSongs()+", "+getDuration();

        return retString;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello. I'm a "+this.type);
    }
}
