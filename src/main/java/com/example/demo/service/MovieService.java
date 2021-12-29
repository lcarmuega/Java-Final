package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;

@Service
public class MovieService {
	private List<Movie> movies;
	Integer counter = 0; 
	
	public MovieService(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Movie> getMovies() {
		return movies;
	}
	
	public Movie getMovieByID (Integer id) {
		List<Movie> moviesCoincidentes = movies.stream().filter( m -> m.getId() == id ).collect(Collectors.toList());
		return moviesCoincidentes.get(0);
	}
	
	public Movie getMovieByName (String name) {
		List<Movie> moviesCoincidentes = movies.stream().filter( m -> m.getTitulo() == name ).collect(Collectors.toList());
		return moviesCoincidentes.get(0);
	}
	
	public List<Movie> getMoviesByIdCategoria (Integer id) {
		List<Movie> moviesCoincidentes = movies.stream().filter( m -> m.getIdCategoria() == id ).collect(Collectors.toList());
		return moviesCoincidentes;
	}

	public Movie createMovie(Movie movie) {
		counter++;
		movie.setId(counter);		
		movies.add(movie);
		return movie;
	}

	public boolean deleteMovie(Integer id) {
		for (Movie m: movies) {
			if(m.getId().equals(id)) {
				movies.remove(m);
				return true;
			}
		}
		return false;
	}

	public Optional<Movie> updateMovie(Movie movie, Integer id) {
		for (Movie m: movies) {
			if(m.getId().equals(id)) {
				movies.remove(m);
				movies.add(movie);
				return Optional.ofNullable(movie);
			}
		}
		return null;
	}	

}
