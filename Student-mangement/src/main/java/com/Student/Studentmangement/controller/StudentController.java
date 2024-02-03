package com.Student.Studentmangement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Studentmangement.Entity.StudentEntity;
import com.Student.Studentmangement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	//get requests
	@GetMapping
	public List<StudentEntity> findAllStudents() {
		return studentService.findAllStudent();
	}

	@GetMapping("{id}")
	public Optional<StudentEntity> findStudentById(@PathVariable("id") Long id) {
		return studentService.findById(id);
	}

	//post requests
	@PostMapping
	public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {

		return studentService.saveStudent(studentEntity);
	}

	//update requests
	@PutMapping("{id}")
	public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
		return studentService.updateStudent(studentEntity);
	}

	//delete requests
	@DeleteMapping("{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		studentService.deleteStudent(id);
	}

}
