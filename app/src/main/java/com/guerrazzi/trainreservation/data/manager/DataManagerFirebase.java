package com.guerrazzi.trainreservation.data.manager;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.guerrazzi.trainreservation.view.LoginActivity;

import androidx.annotation.NonNull;

/**
 * Datamanager per gestire le chiamate di rete su Firebase
 */
public class DataManagerFirebase {

    private static DataManagerFirebase mInstance;
    FirebaseAuth auth;

    public DataManagerFirebase() {

    }

    public static DataManagerFirebase getInstance() {
        if (mInstance == null)
            mInstance = new DataManagerFirebase();
        return mInstance;
    }

    /**
     * Metodo per il recupero delle autorizzazioni dell'utente
     * @return
     */
    public FirebaseAuth getAutorization() {
        return FirebaseAuth.getInstance();
    }

    /**
     * Metodo per il recupero dei dati dell'user
     * @return
     */
    public FirebaseUser getUser() {
        return FirebaseAuth.getInstance().getCurrentUser();

    }
}
