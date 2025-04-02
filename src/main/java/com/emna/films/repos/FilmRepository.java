package com.emna.films.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.films.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long>{

}
