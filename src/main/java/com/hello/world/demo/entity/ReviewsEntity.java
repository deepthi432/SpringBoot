package com.hello.world.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class ReviewsEntity {

	private Long id;
	
	private String comment;

	public ReviewsEntity() {
	
	}

	public ReviewsEntity(String comment) {
		
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ReviewsEntity [id=" + id + ", comment=" + comment + "]";
	}
	
	
	
	
}
