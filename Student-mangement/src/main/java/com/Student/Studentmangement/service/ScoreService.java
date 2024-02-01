package com.Student.Studentmangement.service;

import java.util.List;
import java.util.Optional;

import com.Student.Studentmangement.Entity.ScoreEntity;
import com.Student.Studentmangement.Entity.StudentEntity;

public interface ScoreService {

	//get score of all students
	List<ScoreEntity> findAllScore();

	//get score of a specific student
	Optional<ScoreEntity> findById(StudentEntity id);

	//posting scores
	ScoreEntity saveScore(ScoreEntity scoreEntity);

	//deleting score
	void deleteScore(StudentEntity id);

}
