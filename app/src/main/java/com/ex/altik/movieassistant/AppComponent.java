package com.ex.altik.movieassistant;

import com.ex.altik.movieassistant.details.DetailsComponent;
import com.ex.altik.movieassistant.details.DetailsModule;
import com.ex.altik.movieassistant.favorites.FavoritesModule;
import com.ex.altik.movieassistant.listing.ListingComponent;
import com.ex.altik.movieassistant.listing.ListingModule;
import com.ex.altik.movieassistant.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent {
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
