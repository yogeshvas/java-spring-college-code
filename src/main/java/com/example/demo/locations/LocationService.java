package com.example.demo.locations;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService 
{
    public List<Location> getAllLocations()
    {
        Location l1 = new Location("127021", "HR");
        
        return Arrays.asList(l1);
    }
}
