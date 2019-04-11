package Blatt3;

public interface Lader extends Baumaschine{
     final double MAX_SCHAUFELVOLUMEN = 10;
     final double MAX_KIPPHOEHE = 5;

     double getSchaufelvolumen();
     void setSchaufelvolumen(double schaufelvolumen);
     double getKipphoehe();
     void setKipphoehe(double kipphoehe);
     void laden();

     default void druckeBeschreibung(){
         System.out.println(getName()+", "+getSchaufelvolumen()+", "+getKipphoehe()+", "+getLeistung()+", "+getGewicht()+", "+getBetriebsstuden());
     }
}
