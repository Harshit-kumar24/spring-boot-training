package com.Student.Studentmangement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student.Studentmangement.Entity.ScoreEntity;
import com.Student.Studentmangement.repository.ScoreRepository;
import com.Student.Studentmangement.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {

	private final ScoreRepository scoreRepository;

	public ScoreServiceImpl(ScoreRepository scoreRepository) {
		this.scoreRepository = scoreRepository;
	}

	//GET
	@Override
	public List<ScoreEntity> findAllScore() {
		return scoreRepository.findAll();
	}

	@Override
	public List<ScoreEntity> findByKey(Long key) {
		return scoreRepository.findByKey(key);
	}

	//POST
	@Override
	public ScoreEntity saveScore(ScoreEntity scoreEntity) {
		return scoreRepository.save(scoreEntity);
	}

	//DELETE
	@Override
	public void deleteScore(Long id) {
		scoreRepository.deleteById(id);
		;
	}

}
