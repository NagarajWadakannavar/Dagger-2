package com.example.dagger.dependencyinjection.application;

import com.example.dagger.ui.APIService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    APIService getAPIService();
}
