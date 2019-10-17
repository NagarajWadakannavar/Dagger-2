package com.example.dagger;

import android.app.Application;

import com.example.dagger.dependencyinjection.application.ApplicationComponent;
import com.example.dagger.dependencyinjection.application.DaggerApplicationComponent;

public class DaggerApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationComponent.Builder builder = DaggerApplicationComponent.builder();
        builder.application(this);
        applicationComponent = builder.build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
