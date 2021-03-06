package com.hello.world.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseBallCoach implements Coach{

	FortuneService fortuneService;
	
	@Autowired
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String giveWorkout() {
		
		return getPracticeSession();
		
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

	private String getPracticeSession() {
		
		return "Practice baseball daily";
	}
}
