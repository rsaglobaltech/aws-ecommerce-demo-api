package com.rsaglobaltech.ecs.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecs/demo")
public class NewEndpointController {
    
     @RequestMapping(method = RequestMethod.GET)
    public String newendpoint() {
       // Get the current timestamp
       Date currentDate = new Date();
        
       // Format the timestamp as desired (e.g., "yyyy-MM-dd HH:mm:ss")
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String formattedTimestamp = dateFormat.format(currentDate);
       
       return "Demo Worked - Current Timestamp: " + formattedTimestamp;
    }
    
}
