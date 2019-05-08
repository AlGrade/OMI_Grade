package Blatt6;


public class Gurke extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Gurke(Gericht gericht) {
		super(gericht);
	}

	public void druckeBeschreibung() {
		tempgericht.druckeBeschreibung();
		System.out.println("mit Gurke");
	}

	public double berechneKosten() {
		return tempgericht.berechneKosten() + 0.5;
	}

}