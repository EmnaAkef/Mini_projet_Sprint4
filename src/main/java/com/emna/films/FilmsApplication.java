package com.emna.films;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emna.films.entities.Film;
import com.emna.films.service.FilmService;

@SpringBootApplication
public class FilmsApplication  implements CommandLineRunner{

	@Autowired
	FilmService filmService;
	
	public static void main(String[] args) {
		SpringApplication.run(FilmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		filmService.saveFilm(new Film("Titanic", "Romance", 195.0, new Date(97, 11, 19)));
		filmService.saveFilm(new Film("Joker", "Drama", 122.0, new Date(119, 9, 2)));
		filmService.saveFilm(new Film("The Matrix", "Science Fiction", 136.0, new Date(99, 2, 31)));
	}

}
