package com.example.dagger.dependencyinjection.presentation;

import com.example.dagger.ui.home.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuilderModule {

    @ContributesAndroidInjector(modules = {HomeFragmentModule.class})
    abstract HomeFragment bindHomeActivity();

}
