package com.emna.films.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.emna.films.dto.FilmDTO;
import com.emna.films.entities.Film;
import com.emna.films.entities.Genre;

public interface FilmService {

	FilmDTO saveFilm(FilmDTO f);
	FilmDTO getFilm(Long id);
	List<FilmDTO> getAllFilms();
	
	FilmDTO updateFilm(FilmDTO f);
	void deleteFilm(Film f);
	 void deleteFilmById(Long id);
	 
	Page<Film> getAllFilmsParPage(int page, int size);
	List<Film> findByNomProduit(String nom); 
	List<Film> findByNomFilmContains(String nom); 
	List<Film> findByNomDuree (String nom, Double duree); 
	List<Film> findByGenre (Genre genre); 
	List<Film> findByGenreIdG(Long id); 
	List<Film> findByOrderByNomFilmAsc(); 
	List<Film> trierFilmsNomsDuree(); 
	List<Genre> getAllGenres();
	
	FilmDTO convertEntityToDto (Film film); 
	Film convertDtoToEntity(FilmDTO filmDto);
}
