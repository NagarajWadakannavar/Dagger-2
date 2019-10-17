package com.example.dagger.dependencyinjection.application;

import com.example.dagger.ui.APIService;
import com.example.dagger.utils.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {
    @Singleton
    @Provides
    public Retrofit provideRetrofit() {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(Constants.BASE_URL);
        builder.addConverterFactory(GsonConverterFactory.create());
        return builder.build();
    }

    @Singleton
    @Provides
    public APIService provideAPIService(Retrofit retrofit) {
        return retrofit.create(APIService.class);
    }
}
