package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String title;

	@Column(name = "game_year")
	private Integer year;

	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;

	@Column(columnDefinition = "TEXT")
	private String shortDescription;

	@Column(columnDefinition = "TEXT")
	private String longDescription;

	public Game(){

	}

	public Game(long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription){
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public long getId() { return id; }
	public String getGenre() { return genre; }
	public Double getScore() { return score; }
	public String getTitle() { return title; }
	public Integer getYear() { return year; }
	public String getImgUrl() { return imgUrl; }
	public String getPlatforms() { return platforms; }
	public String getLongDescription() { return longDescription; }
	public String getShortDescription() { return shortDescription; }

	public void setId(long id) { this.id = id; }
	public void setYear(Integer year) { this.year = year; }
	public void setGenre(String genre) { this.genre = genre; }
	public void setScore(Double score) { this.score = score; }
	public void setTitle(String title) { this.title = title; }
	public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }
	public void setPlatforms(String platforms) { this.platforms = platforms; }
	public void setLongDescription(String longDescription) { this.longDescription = longDescription; }
	public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }
}
