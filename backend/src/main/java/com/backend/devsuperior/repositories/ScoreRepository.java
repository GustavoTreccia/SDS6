package com.backend.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.devsuperior.entities.Score;
import com.backend.devsuperior.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
