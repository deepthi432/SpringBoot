package com.hello.world.demo.course.service;

import java.util.List;

import com.hello.world.demo.course.repository.CourseDTO;
import com.hello.world.demo.entity.CourseEntity;

public interface CourseService {

	public CourseEntity saveCourse(CourseDTO course);
	
	public List<CourseEntity> getCoursesByInstructor(Long InstructorId);
	
	public void deleteCourse(Long id);
	
}
