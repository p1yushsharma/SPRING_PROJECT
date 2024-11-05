 package com.javaapp.spring_project;

    public class Device {
    private String name;
    private int powerConsumption; 
    private boolean isOn;

    public Device(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isOn = false; 
    }
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned ON.");
    }

    public void turnOff() {
        isOn = false;

        System.out.println(name + " is turned OFF.");
    }

    public int getPowerConsumption() {
        return isOn ? powerConsumption : 0;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }
}

