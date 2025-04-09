package com.emna.films.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.emna.films.entities.Film;
import com.emna.films.entities.Genre;

@RepositoryRestResource(path = "rest")
public interface FilmRepository extends JpaRepository<Film, Long>{

	List <Film> findByNomFilm(String nom);
	List <Film> findByNomFilmContains(String nom);
	
	/*@Query("select f from Film f where f.nomFilm like %?1 and f.duree > ?2 ")
	List<Film> findByNomDuree (String nom, Double duree);*/

	@Query("select f from Film f where f.nomFilm like %:nom and f.duree > :duree") 
	List<Film> findByNomDuree (@Param("nom") String nom,@Param("duree") Double duree);
	
	@Query("select f from Film f where f.genre = ?1") 
	List<Film> findByGenre (Genre genre);
	
	List<Film> findByGenreIdG(Long id);
	
	List<Film> findByOrderByNomFilmAsc();
	
	@Query("select f from Film f order by f.nomFilm ASC, f.duree ASC") 
	List<Film> trierFilmsNomsDuree ();
}
