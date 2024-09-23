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

    // Lägger till @PostMapping för att hantera POST-förfrågningar som
    // lägger till en ny film. Denna metod tar emot en film via HTTP POST, sparar den i databasen och returnerar en ResponseEntity med
    // statuskoden 201 (CREATED) tillsammans med den sparade filmen.
    @PostMapping
    public ResponseEntity<Film> addFilm(@RequestBody Film film) {
        Film savedFilm = filmService.saveFilm(film);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFilm);
    }


// Lägger till en uppdateringsmetod för att hantera PUT-förfrågningar.
// Den tar emot ett filmnamn (movie) som PathVariable och en film som RequestBody.
// Filmen uppdateras baserat på den nya informationen och sparas i databasen.
    @PutMapping("/{movie}")
    public ResponseEntity<Film> updateFilm(@PathVariable String movie, @RequestBody Film film) {
        film.setMovie(movie);
        Film updatedFilm = filmService.saveFilm(film);
        return ResponseEntity.ok(updatedFilm);
    }
    //Lägger till en metod för att hantera DELETE-förfrågningar.
    // Den tar emot ett filmnamn (movie) som PathVariable och raderar filmen med det namnet från databasen.
    // Returnerar en 204 No Content-status om raderingen lyckas.
    @DeleteMapping("/{movie}")
    public ResponseEntity<Void> deleteFilm(@PathVariable String movie) {
        filmService.deleteFilm(movie);
        return ResponseEntity.noContent().build();
    }

}