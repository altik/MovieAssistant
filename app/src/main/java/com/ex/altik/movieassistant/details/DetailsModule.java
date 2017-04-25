package com.ex.altik.movieassistant.details;

import com.ex.altik.movieassistant.favorites.FavoritesInteractor;
import com.ex.altik.movieassistant.network.RequestHandler;

import dagger.Module;
import dagger.Provides;


@Module
public class DetailsModule {
    @Provides
    @DetailsScope
    MovieDetailsInteractor provideInteractor(RequestHandler requestHandler) {
        return new MovieDetailsInteractorImpl(requestHandler);
    }

    @Provides
    @DetailsScope
    MovieDetailsPresenter providePresenter(MovieDetailsInteractor detailsInteractor,
                                           FavoritesInteractor favoritesInteractor) {
        return new MovieDetailsPresenterImpl(detailsInteractor, favoritesInteractor);
    }
}
