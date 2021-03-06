/*package com.cdp.checkboxreminder.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.RestrictionEntry;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {

    //private Toolbar toolbar;

    private EditText regEmail, regPwd;
    private Button regBtn;
    private TextView regQn;
    private FirebaseAuth mAuth;

    private ProgressDialog loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        //ERROR FINALIZACION FORZADA
        //toolbar = findViewById(R.id.loginToolbar);
        //getSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Registro");

        mAuth = FirebaseAuth.getInstance();
        loader = new ProgressDialog(this);

        regEmail = findViewById(R.id.registrationEmail);
        regPwd = findViewById(R.id.registrationPassword);
        regBtn = findViewById(R.id.registrationButton);
        regQn = findViewById(R.id.registrationPageQuestion);

        regQn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = regEmail.getText().toString().trim();
                String password = regPwd.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    regEmail.setError("Email is required");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    regPwd.setError("Password is required");
                    return;
                }else{
                    loader.setMessage("Registration in progress");
                    loader.setCanceledOnTouchOutside(false);
                    loader.show();
                    mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()) {
                                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                                startActivity(intent);
                                finish();
                                loader.dismiss();
                            }else{
                                String error = task.getException().toString();
                                Toast.makeText(RegistrationActivity.this, "Registration failed" + error, Toast.LENGTH_SHORT).show();
                                loader.dismiss();
                            }
                        }
                    });
                }
            }
        });
    }
}*/