package Blatt6;


public class Spezialsauce extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Spezialsauce(Gericht gericht) {
		super(gericht);

	}

	public void druckeBeschreibung() {
		tempgericht.druckeBeschreibung();
		System.out.println("mit Sauce");
	}

	public double berechneKosten() {
		return tempgericht.berechneKosten() + 0.7;
	}

}