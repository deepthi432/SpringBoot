package com.hello.world.demo.instructor.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.world.demo.entity.InstructorDetailsEntity;
import com.hello.world.demo.entity.InstructorEntity;

@Repository
public class InstructorRepositoryImpl implements InstructorRepository {

	@Autowired SessionFactory sessionFactory;
	
	@Override
	public InstructorEntity saveInstructor(InstructorEntity instructorEntity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(instructorEntity);
		return instructorEntity;
	}

	@Override
	public void deleteInstructor(Long id) {
		Session session = sessionFactory.getCurrentSession(); 
		InstructorEntity instructorEntity=session.get(InstructorEntity.class, id);
		session.delete(instructorEntity);
		session.beginTransaction().commit();
		
	}

	@Override
	public InstructorEntity getInstructor(Long id) {
		Session session = sessionFactory.getCurrentSession();
		InstructorEntity instructorEntity=session.get(InstructorEntity.class, id);
		return instructorEntity;
		
	}

	@Override
	public InstructorEntity getInstructorByInstructorDetailsId(Long id) {
		Session session = sessionFactory.getCurrentSession();
		InstructorDetailsEntity instructorDetailEntity= session.get(InstructorDetailsEntity.class, id);
		return instructorDetailEntity.getInstructorEntity();
		
	}

	@Override
	public InstructorDetailsEntity getInstructorDetail(Long id) {
		Session session = sessionFactory.getCurrentSession();
		InstructorDetailsEntity instructorDetailEntity= session.get(InstructorDetailsEntity.class, id);
		return instructorDetailEntity;
		
	}

}
