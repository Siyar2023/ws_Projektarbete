package com.Siyar.ws_Projektarbete.Services;


import com.Siyar.ws_Projektarbete.Model.Film;
import com.Siyar.ws_Projektarbete.Repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Service
public class ExternalFilmService {
    private final RestTemplate restTemplate = new RestTemplate();
//Lägger till autowired-injektion av FilmRepository för att hantera
// databasoperationer relaterade till filmer i applikationen. @Autowired
// ser till att Spring automatiskt injicerar rätt instans av FilmRepository.
    @Autowired
    private FilmRepository filmRepository;

}
