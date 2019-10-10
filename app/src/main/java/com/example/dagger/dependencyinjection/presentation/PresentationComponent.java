package com.example.dagger.dependencyinjection.presentation;

import androidx.appcompat.app.AlertDialog;

import com.example.dagger.ui.MainActivity;
import com.example.dagger.dependencyinjection.annotations.PresentationScope;
import com.example.dagger.dependencyinjection.application.ApplicationComponent;

import dagger.Component;
@PresentationScope
@Component(dependencies = ApplicationComponent.class, modules = PresentationModule.class)
public interface PresentationComponent {

    AlertDialog getIntroductionAlertDialog();

    void inject(MainActivity activity);
}
