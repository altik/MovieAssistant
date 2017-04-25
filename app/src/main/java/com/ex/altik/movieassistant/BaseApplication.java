package com.ex.altik.movieassistant;

import android.app.Application;
import android.os.StrictMode;

import com.ex.altik.movieassistant.details.DetailsComponent;
import com.ex.altik.movieassistant.details.DetailsModule;
import com.ex.altik.movieassistant.favorites.FavoritesModule;
import com.ex.altik.movieassistant.listing.ListingComponent;
import com.ex.altik.movieassistant.listing.ListingModule;
import com.ex.altik.movieassistant.network.NetworkModule;

/**
 * @author arun
 */
public class BaseApplication extends Application
{
    private AppComponent appComponent;
    private DetailsComponent detailsComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        StrictMode.enableDefaults();
        appComponent = createAppComponent();
    }

    private AppComponent createAppComponent()
    {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .favoritesModule(new FavoritesModule())
                .build();
    }

    public DetailsComponent createDetailsComponent()
    {
        detailsComponent = appComponent.plus(new DetailsModule());
        return detailsComponent;
    }

    public void releaseDetailsComponent()
    {
        detailsComponent = null;
    }

    public ListingComponent createListingComponent()
    {
        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public void releaseListingComponent()
    {
        listingComponent = null;
    }

    public ListingComponent getListingComponent()
    {
        return listingComponent;
    }
}
