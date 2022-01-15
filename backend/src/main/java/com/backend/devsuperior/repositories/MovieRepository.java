package com.backend.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.devsuperior.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
