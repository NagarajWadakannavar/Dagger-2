package com.example.dagger.dependencyinjection.application;

import com.example.dagger.dependencyinjection.presentation.PresentationComponent;
import com.example.dagger.dependencyinjection.presentation.PresentationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { ApplicationModule.class,NetworkModule.class})
public interface ApplicationComponent {

    PresentationComponent newPresentationComponent(PresentationModule presentationModule);
}
