package Blatt3;

public class LaderImpl extends BaumaschinenImpl implements Lader {
     double schaufelvolumen;
     double kipphoehe;

    public LaderImpl(String name, double schaufelvolumen, double kipphoehe, int leistung, double gewicht, double betriebsstunden) {
        if (kipphoehe > MAX_KIPPHOEHE){
            System.err.println("Fehler");
        }
        if(schaufelvolumen > MAX_SCHAUFELVOLUMEN){
            System.err.println("Fehler");
        }

        this.name = name;
        this.schaufelvolumen = schaufelvolumen;
        this.kipphoehe = kipphoehe;
        this.leistung = leistung;
        this.gewicht = gewicht;
        this.betriebsstunden = betriebsstunden;
    }

    @Override
    public double getSchaufelvolumen() {
        return schaufelvolumen;
    }

    @Override
    public void setSchaufelvolumen(double schaufelvolumen) {
        this.schaufelvolumen = schaufelvolumen;
    }

    @Override
    public double getKipphoehe() {
        return kipphoehe;
    }

    @Override
    public void setKipphoehe(double kipphoehe) {
        this.kipphoehe = kipphoehe;
    }

    /*@Override
    public void druckeBeschreibung() {
        System.out.println(name+", "+schaufelvolumen+", "+kipphoehe+", "+leistung+", "+gewicht+", "+betriebsstunden);
    }*/

    @Override
    public void laden() {
        betriebsstunden++;
    }
}
