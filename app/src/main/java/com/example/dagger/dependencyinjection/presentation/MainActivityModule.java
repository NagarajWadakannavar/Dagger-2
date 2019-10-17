package com.example.dagger.dependencyinjection.presentation;

import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

import com.example.dagger.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    public AlertDialog provideAlertDialog(MainActivity mainActivity) {
        return new AlertDialog.Builder(mainActivity).setMessage("Hello! This is a part of dagger introduction").setTitle("Dagger Sample").setPositiveButton("OK, GOT IT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create();
    }

}
