package com.Student.Studentmangement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "score")
public class ScoreEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "id", referencedColumnName = "student_id")
	@MapsId
	private StudentEntity studentEntity;

	@Column(name = "firstYear")
	private int firstYear;

	@Column(name = "secondYear")
	private int secondYear;

	@Column(name = "thirdYear")
	private int thirdYear;

	@Column(name = "fourthYear")
	private int fourthYear;

	//constructor
	public ScoreEntity(int firstYear, int secondYear, int thirdYear, int fourthYear) {
		this.firstYear = firstYear;
		this.secondYear = secondYear;
		this.thirdYear = thirdYear;
		this.fourthYear = fourthYear;
	}

	//getters and setters
	public int getFirstYear() {
		return firstYear;
	}

	public void setFirstYear(int firstYear) {
		this.firstYear = firstYear;
	}

	public int getSecondYear() {
		return secondYear;
	}

	public void setSecondYear(int secondYear) {
		this.secondYear = secondYear;
	}

	public int getThirdYear() {
		return thirdYear;
	}

	public void setThirdYear(int thirdYear) {
		this.thirdYear = thirdYear;
	}

	public int getFourthYear() {
		return fourthYear;
	}

	public void setFourthYear(int fourthYear) {
		this.fourthYear = fourthYear;
	}

}
