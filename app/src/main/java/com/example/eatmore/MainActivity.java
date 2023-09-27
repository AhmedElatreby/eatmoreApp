package com.example.eatmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout cl_welcome;

    private TextView txtLogin, txtSignUp, txtForgotPassword;
    private Button btnSubmit;
    private TextInputLayout edtConfirmPassword;
    private boolean isSignUp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Eatmore);
        setContentView(R.layout.activity_main);

        cl_welcome = findViewById(R.id.cl_welcome);
        txtLogin = findViewById(R.id.txtLogin);
        txtSignUp = findViewById(R.id.txtSignUp);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtForgotPassword = findViewById(R.id.txtForgotPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSignUp = false;
                txtLogin.setBackground(getResources().getDrawable(R.drawable.text_selected));
                txtLogin.setTextColor(getResources().getColor(R.color.white_card));
                txtLogin.setElevation(4);

                txtSignUp.setBackground(getResources().getDrawable(R.drawable.text_unselected));
                txtSignUp.setTextColor(getResources().getColor(R.color.red));
                txtSignUp.setElevation(0);

                btnSubmit.setText("Log in");
                txtForgotPassword.setVisibility(View.VISIBLE);
                edtConfirmPassword.setVisibility(View.GONE);
            }
        });

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSignUp = true;
                txtLogin.setBackground(getResources().getDrawable(R.drawable.text_unselected));
                txtLogin.setTextColor(getResources().getColor(R.color.red));
                txtLogin.setElevation(0);

                txtSignUp.setBackground(getResources().getDrawable(R.drawable.text_selected));
                txtSignUp.setTextColor(getResources().getColor(R.color.white_card));
                txtSignUp.setElevation(4);

                btnSubmit.setText("Sign Up");
                txtForgotPassword.setVisibility(View.GONE);
                edtConfirmPassword.setVisibility(View.VISIBLE);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSignUp) {
                    // sign up goes here
                    Toast.makeText(MainActivity.this, "Signing Up!", Toast.LENGTH_SHORT).show();
                } else {
                    // login goes here
                    Toast.makeText(MainActivity.this, "Log in!", Toast.LENGTH_SHORT).show();

                }
            }
        });

        cl_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cl_welcome.setVisibility(View.GONE);
            }
        });
    }
}