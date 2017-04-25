package com.ex.altik.movieassistant.details;

import com.ex.altik.movieassistant.Api;
import com.ex.altik.movieassistant.Review;
import com.ex.altik.movieassistant.Video;
import com.ex.altik.movieassistant.network.RequestGenerator;
import com.ex.altik.movieassistant.network.RequestHandler;

import org.json.JSONException;

import java.io.IOException;
import java.util.List;

import okhttp3.Request;
import rx.Observable;

class MovieDetailsInteractorImpl implements MovieDetailsInteractor {
    private RequestHandler requestHandler;

    MovieDetailsInteractorImpl(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return Observable.fromCallable(() -> getVideoList(id));
    }

    private List<Video> getVideoList(String id) throws IOException, JSONException {
        String url = String.format(Api.GET_TRAILERS, id);
        Request request = RequestGenerator.get(url);
        String body = requestHandler.request(request);
        return MovieDetailsParser.parseTrailers(body);
    }

    private List<Review> getReviewList(String id) throws IOException, JSONException {
        String url = String.format(Api.GET_REVIEWS, id);
        Request request = RequestGenerator.get(url);
        String body = requestHandler.request(request);
        return MovieDetailsParser.parseReviews(body);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return Observable.fromCallable(() -> getReviewList(id));
    }

}
