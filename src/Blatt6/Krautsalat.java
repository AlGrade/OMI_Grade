package Blatt6;


public class Krautsalat extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Krautsalat(Gericht gericht) {
		super(gericht);

	}

	public void druckeBeschreibung() {
		tempgericht.druckeBeschreibung();
		System.out.println("mit Kraut");
	}

	public double berechneKosten() {
		return tempgericht.berechneKosten() + 1;
	}

}