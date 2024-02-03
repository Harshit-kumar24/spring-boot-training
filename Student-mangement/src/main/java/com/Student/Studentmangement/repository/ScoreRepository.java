package com.Student.Studentmangement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Student.Studentmangement.Entity.ScoreEntity;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreEntity, Long> {

	@Query("SELECT s FROM ScoreEntity s WHERE s.id = :student_id")
	List<ScoreEntity> findByKey(@Param("student_id") Long key);
}
