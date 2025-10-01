package com.emna.films.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.films.entities.User;

public interface UserRepository extends JpaRepository<User, Long> { 
User findByUsername (String username); 
} 
