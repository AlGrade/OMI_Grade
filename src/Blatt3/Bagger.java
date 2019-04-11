package Blatt3;

public interface Bagger extends Baumaschine{
     final double MAX_GRABTIEFE = 15;
     final double MAX_REICHWEITE = 18;

     double getGrabtiefe();
     void setGrabtiefe(double grabtiefe);
     double getReichweite();
     void setReichweite(double reichweite);
     void graben();

    default void druckeBeschreibung(){
        System.out.println(getName()+", "+getGewicht()+", "+getGrabtiefe()+", "+getReichweite()+", "+getLeistung()+", "+getBetriebsstuden());
    }
}
