package com.ex.altik.movieassistant.details;

import com.ex.altik.movieassistant.Movie;
import com.ex.altik.movieassistant.Review;
import com.ex.altik.movieassistant.Video;

import java.util.List;

interface MovieDetailsView {
    void showDetails(Movie movie);

    void showTrailers(List<Video> trailers);

    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
