package com.example.dagger.dependencyinjection.application;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.dagger.model.Person;
import com.example.dagger.utils.Constants;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context getContext() {
        return context;
    }

    @Provides
    public SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    @Provides
    public Person getPerson() {
        return new Person();
    }
}
