package com.Student.Studentmangement.service;

import java.util.List;
import java.util.Optional;

import com.Student.Studentmangement.Entity.StudentEntity;

public interface StudentService {
	//listing all the employees
	List<StudentEntity> findAllStudent();

	Optional<StudentEntity> findById(Long id);

	StudentEntity saveStudent(StudentEntity employeeEntity);

	StudentEntity updateStudent(StudentEntity employeeEntity);

	void deleteStudent(Long id);

}
