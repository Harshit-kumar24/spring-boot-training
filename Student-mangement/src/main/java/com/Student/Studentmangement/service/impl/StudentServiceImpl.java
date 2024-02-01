package com.Student.Studentmangement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Student.Studentmangement.Entity.StudentEntity;
import com.Student.Studentmangement.repository.StudentRepository;
import com.Student.Studentmangement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<StudentEntity> findAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Optional<StudentEntity> findById(Long id) {
		return studentRepository.findById(id);
	}

	@Override
	public StudentEntity saveStudent(StudentEntity employeeEntity) {
		return studentRepository.save(employeeEntity);
	}

	@Override
	public StudentEntity updateStudent(StudentEntity employeeEntity) {
		return studentRepository.save(employeeEntity);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
