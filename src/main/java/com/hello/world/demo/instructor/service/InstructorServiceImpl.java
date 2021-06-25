package com.hello.world.demo.instructor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.world.demo.entity.InstructorDetailsEntity;
import com.hello.world.demo.entity.InstructorEntity;
import com.hello.world.demo.instructor.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired InstructorRepository instructorRepo;
	
	@Override
	public InstructorEntity saveInstructor(InstructorEntity instructor) {
		
		return instructorRepo.saveInstructor(instructor);
	}

	@Override
	public void deleteInstructor(Long id) {
		
		
		instructorRepo.deleteInstructor(id);
	}

	@Override
	public InstructorEntity getInstructor(Long id) {
		
		return instructorRepo.getInstructor(id);
		
	}

	@Override
	public InstructorEntity getInstructorByInstructorDetailId(Long id) {
		
		return instructorRepo.getInstructorByInstructorDetailsId(id);
		
	}

	@Override
	public InstructorDetailsEntity getInstructorDetail(Long id) {
		
		return instructorRepo.getInstructorDetail(id);
	}

}
