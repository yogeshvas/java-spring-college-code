package com.example.demo.posts;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.locations.Location;
import com.example.demo.users.User;


@Service
public class PostService
{
    public List<Post> getAllPosts()
    {
		Post p1 = new Post ("835", "02-09-22", new User ("835", "A", "Jaiswal", new Location("842001", "BR"), "user2@gmail.com"), "#Admission");
		
		return Arrays.asList(p1);
    }
}
