package com.ex.altik.movieassistant.listing;

import com.ex.altik.movieassistant.favorites.FavoritesInteractor;
import com.ex.altik.movieassistant.listing.sorting.SortingOptionStore;
import com.ex.altik.movieassistant.network.RequestHandler;

import dagger.Module;
import dagger.Provides;


@Module
public class ListingModule {
    @Provides
    MoviesListingInteractor provideMovieListingInteractor(FavoritesInteractor favoritesInteractor,
                                                          RequestHandler requestHandler,
                                                          SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractorImpl(favoritesInteractor, requestHandler, sortingOptionStore);
    }

    @Provides
    MoviesListingPresenter provideMovieListingPresenter(MoviesListingInteractor interactor) {
        return new MoviesListingPresenterImpl(interactor);
    }
}
