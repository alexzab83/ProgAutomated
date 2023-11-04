package com.guerrazzi.trainreservation.view.viewmodel;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.guerrazzi.trainreservation.data.manager.DataManagerFirebase;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class BaseViewModel extends AndroidViewModel {

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    public FirebaseAuth getAuthorization() {
        return DataManagerFirebase.getInstance().getAutorization();
    }

    public FirebaseUser getUser() {
        return DataManagerFirebase.getInstance().getUser();
    }
}
