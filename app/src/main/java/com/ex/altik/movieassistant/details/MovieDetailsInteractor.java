package com.ex.altik.movieassistant.details;

import com.ex.altik.movieassistant.Review;
import com.ex.altik.movieassistant.Video;

import java.util.List;

import rx.Observable;


public interface MovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);

    Observable<List<Review>> getReviews(String id);
}
