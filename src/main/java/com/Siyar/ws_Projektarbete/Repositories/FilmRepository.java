package com.Siyar.ws_Projektarbete.Repositories;

import com.Siyar.ws_Projektarbete.Model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, String> {
    List<Film> findByMovieContainingIgnoreCase(String movie);


}
