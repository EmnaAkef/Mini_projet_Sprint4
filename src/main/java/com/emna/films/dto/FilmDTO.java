package com.emna.films.dto;

import java.sql.Date;

import com.emna.films.entities.Genre;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmDTO {
	private Long idFilm;
	private String nomFilm;
	private Double duree;
	private Date dateSortie;
	private Genre genre;
	private String nomG;
	
}
