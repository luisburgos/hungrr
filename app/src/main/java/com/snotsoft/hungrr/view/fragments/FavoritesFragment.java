package com.snotsoft.hungrr.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.snotsoft.hungrr.R;
import com.snotsoft.hungrr.domain.Restaurant;
import com.snotsoft.hungrr.restaurants.RestaurantsLowLevelContract;
import com.snotsoft.hungrr.restaurants.RestaurantsPresenter;
import com.snotsoft.hungrr.restaurants.restaurant.RestaurantProfile;
import com.snotsoft.hungrr.utils.Injection;
import com.snotsoft.hungrr.view.adapters.RestaurantsAdapter;
import com.snotsoft.hungrr.view.contracts.FavoritesContract;
import com.snotsoft.hungrr.view.listeners.RestaurantItemListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elsy on 17/04/2016.
 */
public class FavoritesFragment extends Fragment implements FavoritesContract {

    private RecyclerView mRecyclerView;
    private RestaurantsAdapter mAdapter;
    private RestaurantsLowLevelContract.UserActionsListener mActionsListener;

    public FavoritesFragment() {
    }

    public static FavoritesFragment newInstance() {
        return new FavoritesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new RestaurantsAdapter(getActivity(), new ArrayList<Restaurant>(0), new RestaurantItemListener() {
            @Override
            public void onRestaurantClick(Restaurant clickedRestaurant) {
                mActionsListener.openRestaurantProfile(clickedRestaurant);
            }
        });
    }
/*
    @Override
    public void onResume() {
        super.onResume();
        mActionsListener.loadRestaurants(false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);
        mActionsListener = new RestaurantsPresenter(
                this,
                Injection.provideRestaurantsInteractor(),
                Injection.provideUserSessionManager(getActivity().getApplicationContext()),
                Injection.provideLocationPreferencesManager(getActivity().getApplicationContext())
        );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_restaurants_low_level, container, false);

        mRecyclerView = (RecyclerView) root.findViewById(R.id.restaurants);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }


    @Override
    public void setProgressIndicator(boolean active) {

    }

    @Override
    public void showRestaurants(List<Restaurant> restaurants) {
        mAdapter.replaceData(restaurants);
    }

    @Override
    public void showRestaurantProfileUI(String id) {
        Intent intent = new Intent().setClass(getActivity().getApplicationContext(), RestaurantProfile.class);
        intent.putExtra("restaurantID", id);
        startActivity(intent);
    }

    @Override
    public void showErrorMessage(String message) {
        Snackbar.make(getView(), message, Snackbar.LENGTH_SHORT).show();
    }*/
}