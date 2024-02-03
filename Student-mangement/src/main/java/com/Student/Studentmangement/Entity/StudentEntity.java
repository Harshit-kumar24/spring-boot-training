package com.Student.Studentmangement.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Long id;

	@OneToMany(mappedBy = "studentEntity", cascade = CascadeType.ALL)
	private List<ScoreEntity> scoreEntity;

	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "date_of_birth")
	private String dateOfBirth;

	@Column(name = "address")
	private String address;

	public StudentEntity() {

	}

	public StudentEntity(Long id, String name, String gender, String dateOfBirth, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
