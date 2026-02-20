package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button register = findViewById(R.id.registerBtn);

        register.setOnClickListener(v -> {
            // After signup go back to login
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
    }
}