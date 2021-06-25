package com.hello.world.demo.course.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.world.demo.entity.CourseEntity;
import com.hello.world.demo.entity.ReviewsEntity;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository {

	@Autowired SessionFactory sessionFactory;
	
	@Override
	public ReviewDTO saveReview(ReviewDTO review) {
	
		Session session=sessionFactory.getCurrentSession();
		
		CourseEntity course=session.get(CourseEntity.class, review.getCourseId());
		
		ReviewsEntity reviewentity= new ReviewsEntity();
		
		reviewentity.setComment(review.getComment());
		
		reviewentity.setCourseEntity(course);
		
		session.save(reviewentity);
		
		return review;
		
	}
}
