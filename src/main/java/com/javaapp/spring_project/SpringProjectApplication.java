package com.javaapp.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {
       public static void main(String[] args) {
		    SpringApplication.run(SpringProjectApplication.class, args);
            EnergyManager energyManager = new EnergyManager(400); // Set max allowed power
                    @SuppressWarnings("unused")
            Controller controller = new Controller(energyManager);

            // Creating devices
            Device fridge = new Device("Fridge", 100,21);
            Device ac = new Device("Air Conditioner", 300,22);
            Device light = new Device("Light", 200,23);

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
            var devices = energyManager.getDevices();
        for (Device device : devices) {
            System.out.println(device.getName() + " is " + (device.isOn() ? "ON" : "OFF"));

        } 

       }
}
    



