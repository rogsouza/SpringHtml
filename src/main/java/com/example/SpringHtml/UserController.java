package com.example.SpringHtml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "user/{name}", method = RequestMethod.GET)
	public List<User> getUsers(@PathVariable String name) {
		
		List<User> users = new ArrayList<>();
		
		User user = new User("Rogerio Souza", "radsouza@gmail.com");
		User user2 = new User("Marcia Gravina", "marcia.gravina@gmail.com");
		User user3 = new User(name, "unknow@gmail.com");
		
		users.add(user);
		users.add(user2);
		users.add(user3);
		
		return users;
		
	}
	
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public User setUsers(@RequestBody User user) {
		
		return user;
		
	}
	
}
