package com.masai.webapp.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.webapp.example.entity.User;
import com.masai.webapp.example.service.UserService;

@RestController
@RequestMapping("/userservice")
public class MyController {

	@Autowired
	UserService service;
	@GetMapping("/users")
	public List<User> getUsers(){
		return service.getUsers();
	}
	
	@PostMapping("/users")
	public List<User> createUser(@RequestBody User user){
		return service.addUser(user);
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		return service.getUser(id);
	}
	
	@DeleteMapping("/users/{id}")
	public List<User> deleteUser(@PathVariable int id){
		service.deleteUser(id);
		return service.getUsers();
	}
	
}
