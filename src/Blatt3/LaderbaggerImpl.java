package Blatt3;

public class LaderbaggerImpl /*extends BaggerImpl*/ implements Bagger, Lader {


    /*public LaderbaggerImpl(double grabtiefe, double reichweite, String name, int leistung, double gewicht, int betriebsstunden) {
        super(grabtiefe, reichweite, name, leistung, gewicht, betriebsstunden);
    }*/

    @Override
    public double getGrabtiefe() {
        return 0;
    }

    @Override
    public void setGrabtiefe(double grabtiefe) {

    }

    @Override
    public double getReichweite() {
        return 0;
    }

    @Override
    public void setReichweite(double reichweite) {

    }

    @Override
    public void graben() {

    }

    @Override
    public double getSchaufelvolumen() {
        return 0;
    }

    @Override
    public void setSchaufelvolumen(double schaufelvolumen) {

    }

    @Override
    public double getKipphoehe() {
        return 0;
    }

    @Override
    public void setKipphoehe(double kipphoehe) {

    }

    @Override
    public void laden() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getLeistung() {
        return 0;
    }

    @Override
    public void setLeistung(int leistung) {

    }

    @Override
    public double getGewicht() {
        return 0;
    }

    @Override
    public void setGewicht(double gewicht) {

    }

    @Override
    public double getBetriebsstuden() {
        return 0;
    }

    @Override
    public void druckeBeschreibung() {
        Bagger.super.druckeBeschreibung();
        Lader.super.druckeBeschreibung();
    }
}
