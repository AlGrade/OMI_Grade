package Blatt5.A4_observer_version;

import java.util.Observable;
import java.util.Observer;

public class SomeSensorReader implements Observer {

	SomeSensor sensor;

	public SomeSensorReader(SomeSensor sensor) {
		sensor.addObserver(this);
		this.sensor = sensor;
		System.out.println("Start reading values...");
		
		/*Thread t = new Thread(new Reader());
		t.start();*/
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("SENSOR READER - Gelesener Sensorwert: " + (long)arg);	}


	// Read sensor values in a two seconds interval
	/*private class Reader implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("SENSOR READER - Gelesener Sensorwert: " + sensor.getCurrentValue());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}*/

}
