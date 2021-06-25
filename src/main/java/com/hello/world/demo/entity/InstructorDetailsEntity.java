package com.hello.world.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Entity
@Table(name="instructor_detail")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown=true)
public class InstructorDetailsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="youtube_channel")
	private String youtubeChannnel;
	
	@Column(name="hobby")
	private String hobby;
	
	@OneToOne(mappedBy="instructorDetails",cascade=CascadeType.ALL)
	@JsonBackReference
	private InstructorEntity instructorEntity;

	public InstructorDetailsEntity() {
		
	}

	public InstructorDetailsEntity(Long id, String youtubeChannnel, String hobby) {
		
		this.id = id;
		this.youtubeChannnel = youtubeChannnel;
		this.hobby = hobby;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYoutubeChannnel() {
		return youtubeChannnel;
	}

	public void setYoutubeChannnel(String youtubeChannnel) {
		this.youtubeChannnel = youtubeChannnel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public InstructorEntity getInstructorEntity() {
		return instructorEntity;
	}

	public void setInstructorEntity(InstructorEntity instructorEntity) {
		this.instructorEntity = instructorEntity;
	}

	@Override
	public String toString() {
		return "InstructorDetailsEntity [id=" + id + ", youtubeChannnel=" + youtubeChannnel + ", hobby=" + hobby + "]";
	}
	
	
	
	
	
}
