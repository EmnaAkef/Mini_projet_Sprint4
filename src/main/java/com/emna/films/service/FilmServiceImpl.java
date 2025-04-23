package com.emna.films.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.emna.films.service.FilmService;
import com.emna.films.entities.Film;
import com.emna.films.entities.Genre;
import com.emna.films.repos.FilmRepository;
import com.emna.films.repos.GenreRepository;


@Service
public class FilmServiceImpl implements FilmService{

	@Autowired
	FilmRepository filmRepository;
	
	@Autowired
	GenreRepository genreRepository;
	
	@Override
	public Film saveFilm(Film f) {
		return filmRepository.save(f);
	}

	@Override
	public Film updateFilm(Film f) {
		return filmRepository.save(f);
	}

	@Override
	public void deleteFilm(Film f) {
		filmRepository.delete(f);
		
	}

	@Override
	public void deleteFilmById(Long id) {
		filmRepository.deleteById(id);
		
	}

	@Override
	public Film getFilm(Long id) {
		return filmRepository.findById(id).get();
	}

	@Override
	public List<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@Override
	public Page<Film> getAllFilmsParPage(int page, int size) {
		return filmRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Film> findByNomProduit(String nom) {
		return filmRepository.findByNomFilm(nom); 
	}

	@Override
	public List<Film> findByNomFilmContains(String nom) {
		return filmRepository.findByNomFilmContains(nom); 
	}

	@Override
	public List<Film> findByNomDuree(String nom, Double duree) {
		return filmRepository.findByNomDuree(nom, duree);
	}

	@Override
	public List<Film> findByGenre(Genre genre) {
		return filmRepository.findByGenre(genre); 
	}

	@Override
	public List<Film> findByGenreIdG(Long id) {
		return filmRepository.findByGenreIdG(id); 
	}

	@Override
	public List<Film> findByOrderByNomFilmAsc() {
		return filmRepository.findByOrderByNomFilmAsc();
	}

	@Override
	public List<Film> trierFilmsNomsDuree() {
		return filmRepository.trierFilmsNomsDuree();
	}

	@Override
	public List<Genre> getAllGenres() {
		return genreRepository.findAll();
	}
	
}
