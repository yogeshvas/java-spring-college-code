package com.example.demo.locations;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController
{
	@Autowired
	LocationService ls;
	
    @GetMapping("/locations")
    public List<Location> getAllLocations()
    {
    	return ls.getAllLocations();
    }
}