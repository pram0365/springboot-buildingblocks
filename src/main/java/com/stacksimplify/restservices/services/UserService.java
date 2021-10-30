package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.repositories.UserRepository;

//Service
@Service
public class UserService {
	
	//Autowire the UserRepository
	@Autowired
	private UserRepository userRepository;
	
	
	//getAllUsers method
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//CreateNew User Method
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	//getUserById Method
	public Optional<User> getUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
	
	//updateUserByID
	public User updatedUserById(Long id, User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	public void deleteUserById(Long id) {
		if(userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
		}
		
	}
	
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	

}
