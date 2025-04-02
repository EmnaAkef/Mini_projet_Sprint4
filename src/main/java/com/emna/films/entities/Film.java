package com.emna.films.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idFilm;
	private String nomFilm;
	private String genre;
	private Double duree;
	private Date dateSortie;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
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
		// TODO Auto-generated constructor stub
	}
	public Film(String nomFilm, String genre, Double duree, Date dateSortie) {
		super();
		this.nomFilm = nomFilm;
		this.genre = genre;
		this.duree = duree;
		this.dateSortie = dateSortie;
	}
	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", genre=" + genre + ", duree=" + duree
				+ ", dateSortie=" + dateSortie + "]";
	}
	
}
