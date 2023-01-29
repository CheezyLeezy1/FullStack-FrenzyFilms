package dev.groovymoovy.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin
public class MovieController {

    private final MovieService moviesService;

    public MovieController(MovieService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>> (moviesService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{ImdbId}")
    public ResponseEntity <Optional<Movie>> getMovie(@PathVariable String ImdbId) {
        return new ResponseEntity<Optional<Movie>>(moviesService.getMovie(ImdbId), HttpStatus.OK);
    }

}
