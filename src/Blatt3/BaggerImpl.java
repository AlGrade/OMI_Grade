package Blatt3;

public class BaggerImpl extends BaumaschinenImpl implements Bagger {
     double grabtiefe;
     double reichweite;


    public BaggerImpl(double grabtiefe, double reichweite, String name, int leistung, double gewicht, int betriebsstunden) {

        if(grabtiefe > MAX_GRABTIEFE){
            System.err.println("Fehler");
        }
        if(reichweite > MAX_REICHWEITE){
            System.err.println("Fehler");
        }

        this.grabtiefe = grabtiefe;
        this.reichweite = reichweite;
        this.name = name;
        this.leistung = leistung;
        this.gewicht = gewicht;
        this.betriebsstunden = betriebsstunden;
    }


    @Override
    public double getGrabtiefe() {
        return grabtiefe;
    }

    @Override
    public void setGrabtiefe(double grabtiefe) {
        this.grabtiefe = grabtiefe;
    }

    @Override
    public double getReichweite() {
        return reichweite;
    }

    @Override
    public void setReichweite(double reichweite) {
        this.reichweite = reichweite;
    }

    /*@Override
    public void druckeBeschreibung() {
        System.out.println(name+", "+gewicht+", "+grabtiefe+", "+reichweite+", "+leistung+", "+betriebsstunden);
    }*/

    @Override
    public void graben() {
        betriebsstunden++;
    }
}
