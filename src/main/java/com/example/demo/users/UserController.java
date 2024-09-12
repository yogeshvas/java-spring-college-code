package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController
{
	@Autowired
	UserService us;
	
    @GetMapping("/users")
    public List<User> getAllUsers()
    {
    	return us.getAllUsers();
    }
    
    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable String id) {
    	return us.getUser(id);
    }
}