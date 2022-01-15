package com.backend.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.devsuperior.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
