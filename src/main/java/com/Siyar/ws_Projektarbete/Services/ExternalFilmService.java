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

    @Autowired
    private FilmRepository filmRepository;

    public void fetchRandomFilm() {
        String url = "https://owen-wilson-wow-api.onrender.com/wows/random";

        // Hämta listan av filmer
        List<Film> films = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Film>>() {}).getBody();

        // Kontrollera om listan inte är null och har element
        if (films != null && !films.isEmpty()) {
            // Välj en slumpmässig film från listan
            Film film = films.get(new Random().nextInt(films.size()));
            filmRepository.save(film);
        }
    }
}


