package com.ex.altik.movieassistant.listing;

public interface MoviesListingPresenter {
    void displayMovies();

    void setView(MoviesListingView view);

    void destroy();
}
