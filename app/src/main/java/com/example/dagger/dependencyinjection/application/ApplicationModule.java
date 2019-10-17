package com.example.dagger.dependencyinjection.application;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.dagger.SampleApplication;
import com.example.dagger.model.Person;
import com.example.dagger.utils.Constants;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    public Context provideApplicationContext(SampleApplication application) {
        return application;
    }

    @Provides
    public SharedPreferences provideSharedPreference(Context context) {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    @Provides
    public Person getPerson() {
        return new Person();
    }
}
