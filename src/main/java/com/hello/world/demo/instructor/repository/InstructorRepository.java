package com.hello.world.demo.instructor.repository;

import com.hello.world.demo.entity.InstructorDetailsEntity;
import com.hello.world.demo.entity.InstructorEntity;

public interface InstructorRepository {

	public InstructorEntity saveInstructor(InstructorEntity instructorEntity);
	
	public void deleteInstructor(Long id);
	
	public InstructorEntity getInstructor(Long id);
	
	public InstructorEntity getInstructorByInstructorDetailsId(Long id);
	
	public InstructorDetailsEntity getInstructorDetail(Long id);
	
}
