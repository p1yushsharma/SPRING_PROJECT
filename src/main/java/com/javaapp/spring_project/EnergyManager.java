package com.javaapp.spring_project;

import java.util.ArrayList;
import java.util.List;

public class EnergyManager {
    @SuppressWarnings("FieldMayBeFinal")
    private List<Device> devices;
    @SuppressWarnings("FieldMayBeFinal")
    private int maxAllowedPower; // Maximum allowed power in watts

    public EnergyManager(int maxAllowedPower) {
        this.maxAllowedPower = maxAllowedPower;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
       
            devices.add(device);
            System.out.println("Added device: " + device.getName());
        } 
        
        
    

   public void optimizeEnergyUsage() {
   
            int totalConsumption = getTotalPowerConsumption();

            // Check if total consumption exceeds the max allowed power
            if (totalConsumption > maxAllowedPower) {
                // Iterate through devices and turn them off until consumption is within limit
                for (Device device : devices) {
                    if (device.isOn()) {
                        totalConsumption -= device.getPowerConsumption(); // Reduce total consumption
                        device.turnOff(); // Then turn off the device

                        // Check if total consumption is within the allowed limit
                        if (totalConsumption <= maxAllowedPower) {
                            break; // Exit the loop if within limit
                        }
                    }
                }
                System.out.println("Optimization complete. Devices turned off as needed.");
            }
        } 
         

    public int getTotalPowerConsumption() {
        int total = 0;
       
            for (Device device : devices) {
                total += device.getPowerConsumption();
            }
        
        return total;
    }
          public List<Device> getDevices() {
           return devices; 
}


    public void displayStatus() {
      
            for (Device device : devices) {
                System.out.println(device.getName() + " is " + (device.isOn() ? "ON" : "OFF") +
                                   ", Power Consumption: " + device.getPowerConsumption() + "W");
            }
            System.out.println("Total Power Consumption: " + getTotalPowerConsumption() + "W");
        } 
}
    

