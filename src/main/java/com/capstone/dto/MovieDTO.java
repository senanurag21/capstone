package com.capstone.dto;

public class MovieDTO {
	private Integer movieId;
	private String movieTitle;
	private String dateReleased;
	private String movieRunningTime;

	public MovieDTO(int id, String name, String dateReleased, String movieRunningTime) {
		super();
		this.movieId			= id;
		this.movieTitle			= name;
		this.dateReleased		= dateReleased;
		this.movieRunningTime	= movieRunningTime;
	}
	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getDateReleased() {
		return dateReleased;
	}

	public void setDateReleased(String dateReleased) {
		this.dateReleased = dateReleased;
	}

	public String getMovieRunningTime() {
		return movieRunningTime;
	}

	public void setMovieRunningTime(String movieRunningTime) {
		this.movieRunningTime = movieRunningTime;
	}

}
