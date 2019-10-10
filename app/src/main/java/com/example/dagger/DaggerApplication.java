package com.example.dagger;

import android.app.Application;

import com.example.dagger.dependencyinjection.application.ApplicationComponent;
import com.example.dagger.dependencyinjection.application.ApplicationModule;
import com.example.dagger.dependencyinjection.application.DaggerApplicationComponent;

public class DaggerApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationComponent component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule()).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }


}
