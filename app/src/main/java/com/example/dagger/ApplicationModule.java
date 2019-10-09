package com.example.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApplicationModule {

    @Singleton
    @Provides
    public Retrofit getRetrofit() {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("https://api.github.com/");
        builder.addConverterFactory(GsonConverterFactory.create());
        return builder.build();
    }

    @Singleton
    @Provides
    public APIService getAPIService(Retrofit retrofit) {
        return retrofit.create(APIService.class);
    }
}
