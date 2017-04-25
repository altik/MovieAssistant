package com.ex.altik.movieassistant.favorites;

import com.ex.altik.movieassistant.Movie;

import java.util.List;

public interface FavoritesInteractor {
    void setFavorite(Movie movie);

    boolean isFavorite(String id);

    List<Movie> getFavorites();

    void unFavorite(String id);
}
