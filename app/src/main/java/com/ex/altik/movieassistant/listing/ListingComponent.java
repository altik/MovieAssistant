package com.ex.altik.movieassistant.listing;

import com.ex.altik.movieassistant.listing.sorting.SortingDialogFragment;
import com.ex.altik.movieassistant.listing.sorting.SortingModule;

import dagger.Subcomponent;

@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
