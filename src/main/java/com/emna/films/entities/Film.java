package com.emna.films.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idFilm;
	private String nomFilm;
	private Double duree;
	private Date dateSortie;
	
	@ManyToOne
	private Genre genre;
	
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public Double getDuree() {
		return duree;
	}
	public void setDuree(Double duree) {
		this.duree = duree;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Film() {
		super();
	}
	public Film(String nomFilm, Double duree, Date dateSortie) {
		super();
		this.nomFilm = nomFilm;
		this.duree = duree;
		this.dateSortie = dateSortie;
	}
	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", duree=" + duree
				+ ", dateSortie=" + dateSortie + "]";
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}
