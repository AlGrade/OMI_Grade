package Blatt4;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation1.SimulatedLight1;

public class AdapterSl1 extends SimulatedLight1 implements Actor{
    @Override
    public void switchOn() {
        sendCommand("CONTROL;STATUS;ON");
    }

    @Override
    public void switchOff() {
        sendCommand("CONTROL;STATUS;OFF");
    }

    @Override
    public void setId(String s) {

    }

    @Override
    public String getId() {
        return null;
    }
}
