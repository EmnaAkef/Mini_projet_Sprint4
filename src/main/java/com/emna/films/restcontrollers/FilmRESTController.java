package com.emna.films.restcontrollers;

import org.springframework.web.bind.annotation.RestController;

import com.emna.films.dto.FilmDTO;
import com.emna.films.entities.Film;
import com.emna.films.service.FilmService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class FilmRESTController {

	@Autowired
	FilmService filmService;

	@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<FilmDTO> getAllFilms() {
		return filmService.getAllFilms();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
	public FilmDTO getFilmById(@PathVariable("id") Long id) {
		return filmService.getFilm(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public FilmDTO createFilm(@RequestBody FilmDTO film) {
		return filmService.saveFilm(film);
	}
	
	@RequestMapping(method = RequestMethod.PUT) 
	public FilmDTO updateFilm(@RequestBody FilmDTO filmDTO) { 
	return filmService.updateFilm(filmDTO); 
	}
	
	@RequestMapping(value="/delfilm/{id}",method = RequestMethod.DELETE) 
	public void deleteFilm(@PathVariable("id") Long id) 
	{ 
		filmService.deleteFilmById(id); 
	}
	
	@RequestMapping(value="/FilmsG/{idG}",method = RequestMethod.GET) 
	public List<Film> getFilmsByGId(@PathVariable("idG") Long idG) { 
	return filmService.findByGenreIdG(idG); 
	}
	
	@RequestMapping(value="/flmsByName/{nom}",method = RequestMethod.GET) 
	 public List<Film> findByNomFilmContains(@PathVariable("nom") String nom) { 
	  return filmService.findByNomFilmContains(nom); 
	 } 
}
