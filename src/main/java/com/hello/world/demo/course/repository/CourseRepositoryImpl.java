package com.hello.world.demo.course.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.world.demo.entity.CourseEntity;
import com.hello.world.demo.entity.InstructorEntity;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

	@Autowired SessionFactory sessionFactory;

	@Override
	public CourseEntity saveCourse(CourseDTO course) {
		Session session=sessionFactory.getCurrentSession();
		
		InstructorEntity instructorEntity=session.get(InstructorEntity.class, course.getInstructorId());
		
		CourseEntity courseEntity=new CourseEntity();
		
		courseEntity.setTitle(course.getTitile());
		courseEntity.setInstructor(instructorEntity);
		
		session.saveOrUpdate(courseEntity);
		
		return courseEntity;
		
	}

	@Override
	public List<CourseEntity> getCoursesForInstructor(Long instructorId) {
		Session session=sessionFactory.getCurrentSession();
		
		InstructorEntity instructorEntity=session.get(InstructorEntity.class, instructorId);
		
		return instructorEntity.getCourse();
		
	}

	@Override
	public void deleteCourse(Long courseId) {
		Session session=sessionFactory.getCurrentSession();
		
		CourseEntity course=session.get(CourseEntity.class, courseId);
		
		session.delete(course);
		
		session.beginTransaction().commit();
		
	}

}
