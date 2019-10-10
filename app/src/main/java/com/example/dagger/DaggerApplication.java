package com.example.dagger;

import android.app.Application;

import com.example.dagger.dependencyinjection.application.ApplicationComponent;
import com.example.dagger.dependencyinjection.application.ApplicationModule;
import com.example.dagger.dependencyinjection.application.DaggerApplicationComponent;
import com.example.dagger.dependencyinjection.application.NetworkModule;

public class DaggerApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.Builder builder = DaggerApplicationComponent.builder();
        builder.applicationModule(new ApplicationModule(this));
        builder.networkModule(new NetworkModule()); // This is optional if the module has no bootstrapping dependency
        applicationComponent = builder.build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }


}
