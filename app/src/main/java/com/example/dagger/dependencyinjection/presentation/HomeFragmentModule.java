package com.example.dagger.dependencyinjection.presentation;

import com.example.dagger.ui.home.HomePresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeFragmentModule {

    @Provides
    public HomePresenter provideHomePresenter() {
        return new HomePresenter();
    }
}
