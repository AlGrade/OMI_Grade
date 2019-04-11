package Blatt4;

import java.awt.EventQueue;
import java.util.ArrayList;

import at.omi.smarthome.gui.SmarthomeGUI;
import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.simulation1.SimulatedLight1;
import at.omi.smarthome.simulation2.SimulatedLight2;

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    ArrayList<Device> devices = new ArrayList<Device>();

                    Actor a1 = new AdapterSl1();
                    a1.setId("532521");
                    a1.setName("Lampe Wohnzimmer");

                    Actor a2 = new AdapterSl2();
                    a2.setId("552521");
                    a2.setName("Licht Bad");

                    devices.add(a1);
                    devices.add(a2);
					
					SmarthomeGUI smarthome = new SmarthomeGUI(devices);	
					smarthome.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
