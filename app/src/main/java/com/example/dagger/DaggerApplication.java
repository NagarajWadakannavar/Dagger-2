package com.example.dagger;

import android.app.Activity;
import android.app.Application;

import com.example.dagger.dependencyinjection.application.ApplicationComponent;
import com.example.dagger.dependencyinjection.application.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class DaggerApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationComponent.Builder builder = DaggerApplicationComponent.builder();
        builder.application(this);
        builder.build().inject(this);
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
