package Blatt5.A3;

import at.omi.smarthome.interfaces.Device;

public abstract class DefaultDeviceImpl implements Device{
	
	private String id;
	private String name;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
