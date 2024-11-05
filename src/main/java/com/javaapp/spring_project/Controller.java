
package com.javaapp.spring_project;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/devices")//

public class Controller {
      private final EnergyManager energyManager;
       public Controller(EnergyManager energyManager){this.energyManager = energyManager;}
     @GetMapping("/device")
    public List<Device> getAllDevices() {
        return energyManager.getDevices();
    } 
}


    



     


        


