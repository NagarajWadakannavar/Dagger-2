package com.example.dagger.ui;

import com.example.dagger.model.Person;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("/users/{user}/repos")
    Call<List<Person>> getPersons(@Path("user")String user);
}
