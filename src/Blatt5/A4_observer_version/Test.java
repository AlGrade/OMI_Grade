package Blatt5.A4_observer_version;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SomeSensor someSensor = new SomeSensor();
		SomeSensorReader someSensorReader = new SomeSensorReader(someSensor);
	}
	

}
