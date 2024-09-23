package com.Siyar.ws_Projektarbete.Controller;

import com.Siyar.ws_Projektarbete.Model.Film;
import com.Siyar.ws_Projektarbete.Services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    //filmService-variabeln ska automatiskt injiceras.
    @Autowired
    private FilmService filmService;

    //Lagt @GetMapping för att mappa en HTTP GET-förfrågan till en specifik metod i controller.
    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms() {
        return ResponseEntity.ok(filmService.getAllFilms());
    }


    //Lägger till @GetMapping för att söka, hitta och returnera en film.
    @GetMapping("/{movie}")
    public ResponseEntity<Film> getFilmByMovie(@PathVariable String movie) {
        Film film = filmService.getFilmByMovie(movie);
        if (film != null) {
            return ResponseEntity.ok(film);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}