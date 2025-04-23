package com.emna.films.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emna.films.entities.Genre;

public interface GenreRepository  extends JpaRepository<Genre, Long>{

}
