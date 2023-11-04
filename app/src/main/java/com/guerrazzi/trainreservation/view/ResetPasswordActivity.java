package com.guerrazzi.trainreservation.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.databinding.ActivityResetPasswordBinding;
import com.guerrazzi.trainreservation.view.viewmodel.ResetPasswordViewModel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

public class ResetPasswordActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private ActivityResetPasswordBinding bindingView;
    private ResetPasswordViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(ResetPasswordViewModel.class);
        bindingView = DataBindingUtil.setContentView(this, R.layout.activity_reset_password);
        auth = viewModel.getAuthorization();
        bindingView.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bindingView.btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = bindingView.email.getText().toString().trim();
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplication(), "Inserisci la tua e-mail di registrazione", Toast.LENGTH_SHORT).show();
                    return;
                }
                bindingView.progressBar.setVisibility(View.VISIBLE);
                auth.sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(ResetPasswordActivity.this, "Email inviata", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ResetPasswordActivity.this, "Errore nell'invio della richiesta", Toast.LENGTH_SHORT).show();
                                }

                                bindingView.progressBar.setVisibility(View.GONE);
                            }
                        });
            }
        });
    }

}
