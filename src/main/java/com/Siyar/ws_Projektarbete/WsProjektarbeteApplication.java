package com.Siyar.ws_Projektarbete;


import com.Siyar.ws_Projektarbete.Services.ExternalFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsProjektarbeteApplication implements CommandLineRunner {

	@Autowired
	private ExternalFilmService externalFilmService;

	public static void main(String[] args) {
		SpringApplication.run(WsProjektarbeteApplication.class, args);
	}

	@Override
	public void run(String... args) {
		externalFilmService.fetchRandomFilm();  // Anropa metoden för att hämta och spara film
	}
}




