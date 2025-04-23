package com.emna.films.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.emna.films.entities.Film;
import com.emna.films.entities.Genre;

public interface FilmService {

	Film saveFilm(Film f);
	Film updateFilm(Film f);
	void deleteFilm(Film f);
	 void deleteFilmById(Long id);
	 Film getFilm(Long id);
	List<Film> getAllFilms();
	Page<Film> getAllFilmsParPage(int page, int size);
	List<Film> findByNomProduit(String nom); 
	List<Film> findByNomFilmContains(String nom); 
	List<Film> findByNomDuree (String nom, Double duree); 
	List<Film> findByGenre (Genre genre); 
	List<Film> findByGenreIdG(Long id); 
	List<Film> findByOrderByNomFilmAsc(); 
	List<Film> trierFilmsNomsDuree(); 
	List<Genre> getAllGenres();
}
