package com.hello.world.demo.instructor.service;

import com.hello.world.demo.entity.InstructorDetailsEntity;
import com.hello.world.demo.entity.InstructorEntity;

public interface InstructorService {

	public InstructorEntity saveInstructor(InstructorEntity instructor);
	
	public void deleteInstructor(Long id);
	
	public InstructorEntity getInstructor(Long id);
	
	public InstructorEntity getInstructorByInstructorDetailId(Long id);
	
	public InstructorDetailsEntity getInstructorDetail(Long id);
}
