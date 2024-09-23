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


}