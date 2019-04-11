package Blatt3;

public class BaggerladerImpl extends BaggerImpl implements Bagger, Lader {
    double schaufelvolumen;
    double kipphoehe;

    public BaggerladerImpl(double grabtiefe, double reichweite, String name, int leistung, double gewicht, int betriebsstunden, double schaufelvolumen, double kipphoehe) {
        super(grabtiefe, reichweite, name, leistung, gewicht, betriebsstunden);

        if (kipphoehe > MAX_KIPPHOEHE){
            System.err.println("Fehler");
        }
        if(schaufelvolumen > MAX_SCHAUFELVOLUMEN){
            System.err.println("Fehler");
        }

        this.schaufelvolumen = schaufelvolumen;
        this.kipphoehe = kipphoehe;
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

    @Override
    public void laden() {
        betriebsstunden++;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println(name+", "+gewicht+", "+grabtiefe+", "+reichweite+", "+leistung+", "+betriebsstunden+", "+schaufelvolumen+", "+kipphoehe);
    }
}
