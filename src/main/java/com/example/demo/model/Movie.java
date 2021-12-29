package com.example.demo.model;

public class Movie {
	Integer id;
	String titulo;
	Integer anio;
	String director;
	String resumen;
	Float puntuacion;
	String clasificacion;
	String categoria;
	Integer idCategoria;
	
	public Movie(Integer id, String titulo, Integer anio, String director, String resumen, Float puntuacion,
			String clasificacion, String categoria, Integer idCategoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anio = anio;
		this.director = director;
		this.resumen = resumen;
		this.puntuacion = puntuacion;
		this.clasificacion = clasificacion;
		this.categoria = categoria;
		this.idCategoria = idCategoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Float getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Float puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", titulo=" + titulo + ", anio=" + anio + ", director=" + director + ", resumen="
				+ resumen + ", puntuacion=" + puntuacion + ", clasificacion=" + clasificacion + ", categoria="
				+ categoria + ", idCategoria=" + idCategoria + "]";
	}

}
