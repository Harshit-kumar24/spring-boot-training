package com.Student.Studentmangement.service;

import java.util.List;

import com.Student.Studentmangement.Entity.ScoreEntity;

public interface ScoreService {

	//get score of all students
	List<ScoreEntity> findAllScore();

	//get score of a specific student
	List<ScoreEntity> findByKey(Long key);
	//	Optional<ScoreEntity> findByKey(Long id);

	//posting scores
	ScoreEntity saveScore(ScoreEntity scoreEntity);

	//deleting score
	void deleteScore(Long id);

}
