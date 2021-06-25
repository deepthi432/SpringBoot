package com.hello.world.demo.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class CricketCoach implements Coach {

	@PostConstruct
	public void printPostConstructData() {
		
		System.out.println("This is a post construct method");
	}
	
	@PreDestroy
	public void printPreDestroyData() {
		
		System.out.println("This is a pre destroy method");
	}
	
	@Override
	public String giveWorkout() {
		
		return "Practice Cricket  daily";
	}

	@Override
	public String getFortune() {
		
		return "This is the day for Cricket";
	}

}
