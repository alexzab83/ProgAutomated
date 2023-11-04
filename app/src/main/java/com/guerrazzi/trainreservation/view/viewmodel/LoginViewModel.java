package com.guerrazzi.trainreservation.view.viewmodel;

import android.app.Application;

import com.guerrazzi.trainreservation.data.manager.DataManagerFirebase;

import androidx.annotation.NonNull;

public class LoginViewModel extends BaseViewModel {


    private DataManagerFirebase dataManagerFirebase;

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

}
