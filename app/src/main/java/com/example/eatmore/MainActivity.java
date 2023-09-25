package com.example.eatmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout cl_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Eatmore);
        setContentView(R.layout.activity_main);

        cl_welcome = findViewById(R.id.cl_welcome);

        cl_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cl_welcome.setVisibility(View.GONE);
            }
        });
    }
}