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


    //Läggerin metid för att hämta alla filmer från databasen.
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }





}
