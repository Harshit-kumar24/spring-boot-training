package com.Student.Studentmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.Studentmangement.Entity.ScoreEntity;
import com.Student.Studentmangement.Entity.StudentEntity;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreEntity, StudentEntity> {

}
