package com.emna.films;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.emna.films.entities.Film;
import com.emna.films.service.FilmService;

@SpringBootApplication
public class FilmsApplication  implements CommandLineRunner{

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration; 
	
	public static void main(String[] args) {
		SpringApplication.run(FilmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		repositoryRestConfiguration.exposeIdsFor(Film.class); 
	}

}
