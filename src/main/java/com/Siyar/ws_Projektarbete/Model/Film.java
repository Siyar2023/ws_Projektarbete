package com.Siyar.ws_Projektarbete.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    //Lägger till privata variabler med Getters/Setters
    @Id
    @Column(name = "movie", unique = true, nullable = false) //Lägger till @Column annotering.
    private String movie;
    private int year;
    private String release_date;
    private String director;
    private String character;
    private String movie_duration;
    private String timestamp;
    private String full_line;
    private int current_wow_in_movie;
    private int total_wows_in_movie;
    private String poster;

    @Embedded
    private Video video;
    private String audio;

    // Getters och Setters
    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMovie_duration() {
        return movie_duration;
    }

    public void setMovie_duration(String movie_duration) {
        this.movie_duration = movie_duration;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFull_line() {
        return full_line;
    }

    public void setFull_line(String full_line) {
        this.full_line = full_line;
    }

    public int getCurrent_wow_in_movie() {
        return current_wow_in_movie;
    }

    public void setCurrent_wow_in_movie(int current_wow_in_movie) {
        this.current_wow_in_movie = current_wow_in_movie;
    }

    public int getTotal_wows_in_movie() {
        return total_wows_in_movie;
    }

    public void setTotal_wows_in_movie(int total_wows_in_movie) {
        this.total_wows_in_movie = total_wows_in_movie;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}

<<<<<<< HEAD

=======
>>>>>>> 716ab4ada4ebfbad39bd160c8625c0ac025c9723
