package com.emna.films.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.films.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> { 
Role findByRole(String role); 
} 
