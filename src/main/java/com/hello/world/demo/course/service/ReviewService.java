package com.hello.world.demo.course.service;

import com.hello.world.demo.course.repository.ReviewDTO;
import com.hello.world.demo.entity.ReviewsEntity;

public interface ReviewService {

	public ReviewDTO savereview(ReviewDTO review);
}
