package com.example.dagger.dependencyinjection.application;

import com.example.dagger.dependencyinjection.presentation.FragmentBuilderModule;
import com.example.dagger.dependencyinjection.presentation.MainActivityModule;
import com.example.dagger.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Create BuildersModule class which will define bindings for our sub-components so that Dagger can inject them.
 * Note that @ContributesAndroidInjector annotation (introduced in 2.11) frees us from having to create separate components
 * annotated with @Subcomponent
 */
@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = {MainActivityModule.class, FragmentBuilderModule.class})
    abstract MainActivity bindMainActivity();
}
