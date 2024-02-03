package com.Student.Studentmangement.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	//GET
	@GetMapping("{studentId}")
	public ResponseEntity<List<ScoreEntity>> getScoreForStudent(@PathVariable Long studentId) {

		List<ScoreEntity> scores = scoreService.findByKey(studentId);
		return ResponseEntity.ok(scores);

	}
	//POST

	@PostMapping
	public ScoreEntity postScoreForStudent(@RequestBody ScoreEntity scoreEntity) {
		return scoreService.saveScore(scoreEntity);
	}
	//DELETE

	@DeleteMapping("{studentId}")
	public void deleteScoreForStudent(@PathVariable Long studentId) {
		scoreService.deleteScore(studentId);
	}

}
