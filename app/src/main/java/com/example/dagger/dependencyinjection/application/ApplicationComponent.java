package com.example.dagger.dependencyinjection.application;

import com.example.dagger.DaggerApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        ApplicationModule.class, NetworkModule.class, ActivityBuilderModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(DaggerApplication daggerApplication);

        ApplicationComponent build();
    }

    void inject(DaggerApplication daggerApplication);
}
