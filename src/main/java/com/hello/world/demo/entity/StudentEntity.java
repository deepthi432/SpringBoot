package com.hello.world.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Entity
@Table(name="selenium")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StudentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tutorial_id")
	Long tutorialId;
	
	@Column(name="tutorial_title")
	String tutorialTitle;
	
	@Column(name="tutorial_author")
	String tutorialAuthor;
	
	@Column(name="submission_date")
	String submissionDate;
	
	public StudentEntity() {
		
		
	}

	public StudentEntity(Long id, String title, String author, String date) {
		super();
		this.tutorialId = tutorialId;
		this.tutorialTitle = tutorialTitle;
		this.tutorialAuthor = tutorialAuthor;
		this.submissionDate = submissionDate;
	}

	public Long getTutorialId() {
		return tutorialId;
	}

	public void setTutorialId(Long tutorialId) {
		this.tutorialId = tutorialId;
	}

	public String getTutorialTitle() {
		return tutorialTitle;
	}

	public void setTutorialTitle(String tutorialTitle) {
		this.tutorialTitle = tutorialTitle;
	}

	public String getTutorialAuthor() {
		return tutorialAuthor;
	}

	public void setTutorialAuthor(String tutorialAuthor) {
		this.tutorialAuthor = tutorialAuthor;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	
}
