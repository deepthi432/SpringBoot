package com.hello.world.demo.course.repository;

import java.util.List;

import com.hello.world.demo.entity.CourseEntity;

public interface CourseRepository {

	public CourseEntity saveCourse(CourseDTO course);
	
	public List<CourseEntity> getCoursesForInstructor(Long instructorId);
	
	public void deleteCourse(Long courseId);
	
}