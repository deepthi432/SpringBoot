package com.hello.world.demo.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.world.demo.course.repository.ReviewDTO;
import com.hello.world.demo.course.repository.ReviewRepository;
import com.hello.world.demo.entity.ReviewsEntity;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired ReviewRepository reviewRepo;

	@Override
	public ReviewDTO savereview(ReviewDTO review) {
		
		return reviewRepo.saveReview(review);
	}

	
	
	

	
}
