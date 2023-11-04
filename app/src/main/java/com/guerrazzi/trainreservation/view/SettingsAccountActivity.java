package com.guerrazzi.trainreservation.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.databinding.ActivitySettingsBinding;
import com.guerrazzi.trainreservation.view.viewmodel.SettingsViewModel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

public class SettingsAccountActivity extends AppCompatActivity {

    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;
    private ActivitySettingsBinding bindingView;
    private SettingsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(SettingsViewModel.class);
        bindingView = DataBindingUtil.setContentView(this, R.layout.activity_settings);


        bindingView.toolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(bindingView.toolbar);

        auth = viewModel.getAuthorization();

        final FirebaseUser user = viewModel.getUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (user == null) {
                    startActivity(new Intent(SettingsAccountActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };
        bindingView.signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });

    }

    //sign out method
    public void signOut() {
        auth.signOut();
        startActivity(new Intent(this, LoginActivity.class));
        finish();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
        auth.addAuthStateListener(authListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (authListener != null) {
            auth.removeAuthStateListener(authListener);
        }
    }
}