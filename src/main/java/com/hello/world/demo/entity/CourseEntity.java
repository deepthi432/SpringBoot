package com.hello.world.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="course")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="instructor_id")
	@JsonManagedReference
	private InstructorEntity instructor;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL,mappedBy="courseEntity")
	@JsonBackReference
	private List<ReviewsEntity> reviews;

	public CourseEntity() {
		
	}

	public CourseEntity(String title, InstructorEntity instructor) {
		
		this.title = title;
		this.instructor = instructor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public InstructorEntity getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorEntity instructor) {
		this.instructor = instructor;
	}
	
	

	public List<ReviewsEntity> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewsEntity> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", title=" + title + "]";
	}
	
	
	
}
