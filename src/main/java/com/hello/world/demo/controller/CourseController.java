package com.hello.world.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.world.demo.course.repository.CourseDTO;
import com.hello.world.demo.course.repository.ReviewDTO;
import com.hello.world.demo.course.service.CourseService;
import com.hello.world.demo.course.service.ReviewService;
import com.hello.world.demo.entity.CourseEntity;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired CourseService courseService;
	@Autowired ReviewService reviewService;
	
	@PostMapping
	public CourseEntity saveCourse(@RequestBody CourseDTO course) {
		
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/instructor/{id}")
	public List<CourseEntity> getCoursesForInstructor(@PathVariable Long id){
		
		return courseService.getCoursesByInstructor(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable Long id) {
		
		courseService.deleteCourse(id);
	}
	
	@PostMapping("/review")
	public ReviewDTO saveReview(@RequestBody ReviewDTO review) {
		
		return reviewService.savereview(review);
	}
	
}
