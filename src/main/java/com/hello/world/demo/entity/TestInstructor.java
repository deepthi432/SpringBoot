package com.hello.world.demo.entity;

public class TestInstructor {

	public static void main(String[] args) {
		
		InstructorDetailsEntity ins=new InstructorDetailsEntity(11l,"My Channel","coding");
		
		///ins to db
		
		InstructorEntity instructor=new InstructorEntity(45l,"abc","xzy","abc.xyz@gmail.com",ins);
		
		//instructor in DB

	}

}
