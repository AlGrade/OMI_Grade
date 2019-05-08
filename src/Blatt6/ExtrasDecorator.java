package Blatt6;


public abstract class ExtrasDecorator extends Gericht {

	protected Gericht tempgericht;

	/**
	 * 
	 * @param gericht
	 */
	public ExtrasDecorator(Gericht gericht) {
		this.tempgericht = gericht;
	}

	public abstract void druckeBeschreibung();

}