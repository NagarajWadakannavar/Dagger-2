package com.example.dagger.dependencyinjection.presentation;

import com.example.dagger.ui.MainActivity;

import dagger.Subcomponent;

@Subcomponent(modules = PresentationModule.class)
public interface PresentationComponent {

    void inject(MainActivity activity);
}
