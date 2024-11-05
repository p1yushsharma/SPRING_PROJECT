package com.javaapp.spring_project;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

          public static void main(String[] args) {
		
            EnergyManager energyManager = new EnergyManager(400); // Set max allowed power

            // Creating devices
            Device fridge = new Device("Fridge", 100);
            Device ac = new Device("Air Conditioner", 300);
            Device light = new Device("Light", 200);

            // Add devices to the manager
            energyManager.addDevice(fridge);
            energyManager.addDevice(ac);
            energyManager.addDevice(light);

            // Turn on some devicesZ
            fridge.turnOn();
            ac.turnOn(); // Total: 400W
            light.turnOn(); // Total: 600W

            // Display initial status
            System.out.println("Initial status:");
            energyManager.displayStatus();

            // Optimize energy usage
            System.out.println("\nOptimizing energy usage...");
            energyManager.optimizeEnergyUsage();

            // Display status after optimization
            System.out.println("Status after optimization:");
            energyManager.displayStatus();

        } 
}
    



