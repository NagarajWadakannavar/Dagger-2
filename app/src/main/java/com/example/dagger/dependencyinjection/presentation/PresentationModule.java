package com.example.dagger.dependencyinjection.presentation;

import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class PresentationModule {

    private final FragmentActivity activity;

    public PresentationModule(FragmentActivity activity) {
        this.activity = activity;
    }

    @Provides
    public AlertDialog getAlertDialog() {
        return new AlertDialog.Builder(activity).setMessage("Hello! This is a part of dagger introduction").setPositiveButton("OK, GOT IT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create();
    }

}
