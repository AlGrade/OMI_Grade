package Blatt2;

import java.util.ArrayList;

public class MediaAdministation {
    private static long nextID = 0;
    ArrayList<Medium> mediaArchive;

    public MediaAdministation(ArrayList<Medium> mediaArchive) {
        this.mediaArchive = mediaArchive;
    }

    private static long getNextID(){
        nextID++;
        return nextID;
    }

    public long addMedium(Medium medium){
        medium.setId(getNextID());
        mediaArchive.add(medium);
        return medium.getId();
    }

    public Medium getMedium(long id){
        for(Medium m : mediaArchive){
            if(m.getId() == id){
                return m;
            }
        }
        return null;
    }

    public long getMediaArchiveSize(){
        return mediaArchive.size();
    }

    public long getCurrentID(){
        return nextID;
    }

    //Getter,Setter:

    public static void setNextID(long nextID) {
        MediaAdministation.nextID = nextID;
    }

    public ArrayList<Medium> getMediaArchive() {
        return mediaArchive;
    }

    public void setMediaArchive(ArrayList<Medium> mediaArchive) {
        this.mediaArchive = mediaArchive;
    }

    ////////////////

    public void showMedia(){
        for(Medium m : mediaArchive){
            System.out.println(m.printInfo());
        }
    }

    public void showMedium(long id){
        boolean b = false;

        for(Medium m : mediaArchive){
            if (m.getId() == id){
                System.out.println(m.printInfo());
                b = true;
            }
        }
        if(b == false){
            System.out.println("not found");
        }
    }

    public boolean removeMedium(long id){
        for(Medium m : mediaArchive){
            if(m.getId() == id){
                mediaArchive.remove(m);
                return true;
            }
        }
        return false;
    }

}
