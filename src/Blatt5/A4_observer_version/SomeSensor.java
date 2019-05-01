package Blatt5.A4_observer_version;

import java.util.Observable;
import java.util.Random;

public class SomeSensor extends Observable {

	private long currentValue;

	public SomeSensor() {
		System.out.println("Initializing sensor...");
		currentValue = -1;
		Thread t = new Thread(new ValueGenerator());
		t.start();
	}

	public long getCurrentValue() {
		return currentValue;
	}

	private void setCurrentValue(long currentValue) {
		this.currentValue = currentValue;
		super.notifyObservers(currentValue);
	}


	// simulate dynamic change of sensor values
	private class ValueGenerator implements Runnable {

		@Override
		public void run() {
			while (true) {
				setCurrentValue(new Random().nextLong());
				System.out.println("SENSOR - �ndere Wert auf: "+getCurrentValue());

				long timeToSleep = new Random().nextInt(12);
				try {
					Thread.sleep(timeToSleep * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}
}
