package com.hello.world.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.world.demo.entity.InstructorDetailsEntity;
import com.hello.world.demo.entity.InstructorEntity;
import com.hello.world.demo.instructor.service.InstructorService;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

	@Autowired InstructorService instructorService;
	
	@PostMapping
	public InstructorEntity saveInstructor(@RequestBody InstructorEntity instructor) {
		
		return instructorService.saveInstructor(instructor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteInstructor(@PathVariable Long id) {
		
		instructorService.deleteInstructor(id);
	}
	
	@GetMapping("/{id}")
	public InstructorEntity getInstructorById(@PathVariable Long id) {
	
		return instructorService.getInstructor(id);
	}
	
	@GetMapping("/detail/{id}")
	public InstructorEntity getInstructorByInstructorDetailId(@PathVariable Long id) {
		
		return instructorService.getInstructorByInstructorDetailId(id);
	}
	
	@GetMapping("/insdetail/{id}")
	public InstructorDetailsEntity getInstructorDetailId(@PathVariable Long id) {
		
		return instructorService.getInstructorDetail(id);
	}
	
}
