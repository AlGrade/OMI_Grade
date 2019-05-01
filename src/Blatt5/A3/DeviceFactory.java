package Blatt5.A3;


import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.interfaces.Sensor;

public class DeviceFactory  {


    public Device createDevice( String model){

        Device tempDevice = null;

        if(model.equals("A1")){
            tempDevice = new SimulatedLight1Adapter();

        }
        else if(model.equals("A2")){
            tempDevice = new SimulatedLight2Adapter();

        }
        else if(model.equals("S1")){
            tempDevice = new SensorImpl();
            ((Sensor)tempDevice).setUnit("SomeUnit");

        }

        else{
            System.out.println("Unknown device model: "+model);
        }

        return tempDevice;
    }
}
