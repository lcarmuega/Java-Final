package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MovieService;
import com.example.demo.model.Movie;

@RequestMapping("apiMovie/v1")
@RestController
public class MovieController {
	
private final MovieService movieService;
	
	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/movies")
	public List<Movie> getMovies() {
		return movieService.getMovies();
	}
	
	@GetMapping("/movie/{id}")
	public Movie getMovieByID(@PathVariable Integer id) {
		return movieService.getMovieByID(id);
	}
	
	@GetMapping("/moviesCategoria/{id}")
	public List<Movie> getMoviesByCategoria(@PathVariable Integer id) {
		return movieService.getMoviesByIdCategoria(id);
	}
	
	@PostMapping("/addMovie")
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}
	
	@DeleteMapping("/deleteMovie/{id}")
	public boolean deleteMovie(@PathVariable Integer id) {
		return movieService.deleteMovie(id);
	}
	
	@PutMapping("/updateMovie/{id}")
	public Movie updateMovie(@RequestBody Movie movie, @PathVariable Integer id) {
		return (movieService.updateMovie(movie, id))
				.orElseThrow(() -> new RuntimeException("Movie not found!"));
	}

}
