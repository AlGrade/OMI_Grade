package Blatt3;

public abstract class BaumaschinenImpl implements Baumaschine {
    String name;
    int leistung;
    double gewicht;
    double betriebsstunden;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLeistung() {
        return leistung;
    }

    @Override
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    @Override
    public double getGewicht() {
        return gewicht;
    }

    @Override
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public double getBetriebsstuden() {
        return betriebsstunden;
    }
}
