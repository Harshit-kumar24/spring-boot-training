package com.Student.Studentmangement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Studentmangement.Entity.ScoreEntity;
import com.Student.Studentmangement.service.ScoreService;

@RestController
@RequestMapping("/score")
public class ScoreController {
	private final ScoreService scoreService;

	public ScoreController(ScoreService scoreService) {
		this.scoreService = scoreService;
	}

	@GetMapping
	public List<ScoreEntity> findAllScore() {
		return scoreService.findAllScore();
	}
}
