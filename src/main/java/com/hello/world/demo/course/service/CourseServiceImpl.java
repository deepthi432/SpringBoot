package com.hello.world.demo.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.world.demo.course.repository.CourseDTO;
import com.hello.world.demo.course.repository.CourseRepository;
import com.hello.world.demo.entity.CourseEntity;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired CourseRepository courseRepo;
	
	@Override
	public CourseEntity saveCourse(CourseDTO course) {
		
		return courseRepo.saveCourse(course);
		
	}

	@Override
	public List<CourseEntity> getCoursesByInstructor(Long InstructorId) {
		
		return courseRepo.getCoursesForInstructor(InstructorId);
	}

	@Override
	public void deleteCourse(Long id) {
		courseRepo.deleteCourse(id);
		
	}

}
