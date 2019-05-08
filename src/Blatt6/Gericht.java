package Blatt6;

public abstract class Gericht {

	protected String beschreibung;

	public void druckeBeschreibung() {
		System.out.println(beschreibung);
	}

	public abstract double berechneKosten();

}