package com.Student.Studentmangement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "score_info")
public class ScoreEntity {

	//unique id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//reference
	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentEntity studentEntity;

	@Column(name = "year")
	private int year;

	@Column(name = "score")
	private double score;

	//constructor
	public ScoreEntity() {

	}

	public ScoreEntity(Long id, int year, double score) {
		this.id = id;
		this.year = year;
		this.score = score;
	}

	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
