
package com.hello.world.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.world.demo.service.Coach;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@Autowired 
	Coach cricketCoach;
	
	@GetMapping
	public String returnHelloWorld() {
		
		System.out.println("The hashcode in Hello world is:"+ cricketCoach.hashCode());
		return cricketCoach.giveWorkout();
		
	}
	
	@GetMapping("/world")
	public String returnSecondMethod() {
		
		System.out.println("In world");
		
		return "Hello world second method";
	}
	
	
}
