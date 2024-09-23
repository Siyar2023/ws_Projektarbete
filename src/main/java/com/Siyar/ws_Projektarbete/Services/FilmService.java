package com.Siyar.ws_Projektarbete.Services;


import com.Siyar.ws_Projektarbete.Model.Film;
import com.Siyar.ws_Projektarbete.Repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    //Lägger till @Autowired
    @Autowired
    private FilmRepository filmRepository;


    //Lägger in metod för att hämta alla filmer från databasen.
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    //Denna metod returnerar en film från databasen baserat på det angivna filmnamnet. Den använder filmRepository för att söka efter filmen med det specifika ID
    //(filmnamnet) och returnerar filmen om den finns, annars returneras null.
    public Film getFilmByMovie(String movie) {
        return filmRepository.findById(movie).orElse(null);
    }
    //Denna metod tar en Film-objekt som parameter och sparar det i databasen.
    // Den använder filmRepository för att utföra operationen och returnerar det sparade filmobjektet, vilket inkluderar eventuella genererade ID
    //eller andra förändringar som gjorts av databasen.
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    //Denna metod, deleteFilm, tar en strängparameter movie, som representerar ID
    //för en film, och anropar deleteById-metoden på filmRepository.
    public void deleteFilm(String movie) {
        filmRepository.deleteById(movie);
    }

   //Denna metod, searchFilmsByMovie, tar en strängparameter movie och returnerar en lista av Film-objekt.
   // Den använder filmRepository för att hämta filmer vars namn innehåller den angivna strängen, oavsett om bokstäverna är stora eller små.
    public List<Film> searchFilmsByMovie(String movie) {
        return filmRepository.findByMovieContainingIgnoreCase(movie);
    }
}

