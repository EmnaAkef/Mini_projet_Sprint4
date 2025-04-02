package com.emna.films;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.emna.films.entities.Film;
import com.emna.films.repos.FilmRepository;
import com.emna.films.service.FilmService;

@SpringBootTest
class FilmsApplicationTests {

	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private FilmService filmService;

	@Test
	public void testCreateFilm() {
		Film f = new Film("The Godfather", "Crime", 175.0, new Date(72, 2, 24));
		filmRepository.save(f);
	}

	@Test
	public void testFindFilm() {
		Film f = filmRepository.findById(1L).get();
		System.out.println(f);
	}

	@Test
	public void testUpdateFilm() {
		Film f = filmRepository.findById(2L).get();
		f.setNomFilm("Avatar");
		filmRepository.save(f);
	}

	@Test
	public void testDeleteFilm() {
		filmRepository.deleteById(3L);
	}

	@Test
	public void testListerTousFilms() {
		List<Film> films = filmRepository.findAll();
		for (Film f : films) {
			System.out.println(f);
		}
	}
	
	@Test 
	public void testFindByNomFilmContains() 
	{ 
	Page<Film>  films = filmService.getAllFilmsParPage(0,2); 
	System.out.println(films.getSize()); 
	System.out.println(films.getTotalElements()); 
	System.out.println(films.getTotalPages()); 
	
	films.getContent().forEach(f -> {System.out.println(f.toString()); 
	});  
	/*ou bien 
	for (Produit p : prods) 
	{ 
	System.out.println(p); 
	} */
	}

}
