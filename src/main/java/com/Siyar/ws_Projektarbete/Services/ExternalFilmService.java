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
    ////Lägger till autowired-injektion av FilmRepository för att hantera
    //// databasoperationer relaterade till filmer i applikationen. @Autowired
    //// ser till att Spring automatiskt injicerar rätt instans av FilmRepository.
    @Autowired
    private FilmRepository filmRepository;
    // Lägger till en metod för att hämta en slumpmässig film via ett API-anrop
    //    // till URL
    //    //"https://owen-wilson-wow-api.onrender.com/wows/random".
    //    // Denna metod kan användas
    //    // för att integrera data från en extern källa i applikationen.
    public void fetchRandomFilm() {
        String url = "https://owen-wilson-wow-api.onrender.com/wows/random";

        //Denna kodsnutt hämtar en lista av filmer från ett givet API genom att
        //    // använda RestTemplate och metoden exchange. Den gör en
        //    // GET-förfrågan till den angivna URL
        //    //och returnerar resultatet som en lista av Film-objekt.
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




