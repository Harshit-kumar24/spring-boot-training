package com.Student.Studentmangement.service.impl;

import java.util.List;
import java.util.Optional;

import com.Student.Studentmangement.Entity.ScoreEntity;
import com.Student.Studentmangement.Entity.StudentEntity;
import com.Student.Studentmangement.repository.ScoreRepository;
import com.Student.Studentmangement.service.ScoreService;

public class ScoreServiceImpl implements ScoreService {

	private final ScoreRepository scoreRepository;

	public ScoreServiceImpl(ScoreRepository scoreRepository) {
		this.scoreRepository = scoreRepository;
	}

	//get
	@Override
	public List<ScoreEntity> findAllScore() {
		return scoreRepository.findAll();
	}

	@Override
	public Optional<ScoreEntity> findById(StudentEntity id) {
		return scoreRepository.findById(id);
	}

	//post
	@Override
	public ScoreEntity saveScore(ScoreEntity scoreEntity) {
		return scoreRepository.save(scoreEntity);
	}

	//delete
	@Override
	public void deleteScore(StudentEntity id) {
		scoreRepository.deleteById(id);

	}

}
