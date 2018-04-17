package org.foobarspam.furnaceDIP.types;

public class RoomTemperature {
	
	private double temperature = 15;

	private static RoomTemperature temperature = new RoomTemperature();

	private RoomTemperature(){}

	public static RoomTemperature getInstance(){
		return temperature;
	}
	
	public RoomTemperature(double temperature){
		this.temperature = temperature;
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void incrementTemperature(double increment){
		this.temperature += increment;
	}
}
