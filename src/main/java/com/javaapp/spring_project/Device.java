 package com.javaapp.spring_project;

    public class Device {
    private String name;
    private int powerConsumption; 
    private boolean isOn;
    private int id ;
    public Device(String name, int powerConsumption, int id ){
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isOn = false; 
        this.id = id;
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
    public int getid(){
        return id;
    }
}

