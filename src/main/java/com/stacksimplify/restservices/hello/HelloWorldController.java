package com.stacksimplify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Simpmle Method
	//URI - /helloworld
	//GET
	//@RequestMapping(method = RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworld")
	public String helloWorld() {
		
		return "Hello-World";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Parshu", "Yadav", "Mumbai");
	}
	

}
