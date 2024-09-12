package com.example.demo.users;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.locations.Location;



@Service
public class UserService 
{
    public List<User> getAllUsers()
    {
    	
    	User user1 = new User ("503", "A", "Sharma", new Location("127021", "HR"), "user1@gmail.com");
    	User user2 = new User ("835", "A", "Jaiswal", new Location("842001", "BR"), "user2@gmail.com");
    	
    	return Arrays.asList(user1, user2);
    }
    
   

	public User getUser(String id) {
		User user = getAllUsers().stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);
    	return user;
	}
}