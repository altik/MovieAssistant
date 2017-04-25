package com.ex.altik.movieassistant.listing;

import com.ex.altik.movieassistant.Movie;

import java.util.List;

import rx.Observable;

public interface MoviesListingInteractor {
    Observable<List<Movie>> fetchMovies();
}
