package Blatt6;


public class Senf extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Senf(Gericht gericht) {
		super(gericht);
	}

	public void druckeBeschreibung() {
		tempgericht.druckeBeschreibung();
		System.out.println("mit Senf");
	}

	public double berechneKosten() {
		return tempgericht.berechneKosten() + 0.2;
	}

}