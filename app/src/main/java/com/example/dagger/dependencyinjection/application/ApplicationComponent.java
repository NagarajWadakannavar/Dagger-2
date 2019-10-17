package com.example.dagger.dependencyinjection.application;

import com.example.dagger.SampleApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        ApplicationModule.class, NetworkModule.class, ActivityBuilderModule.class})
public interface ApplicationComponent extends AndroidInjector<SampleApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<SampleApplication> {
    }

}
