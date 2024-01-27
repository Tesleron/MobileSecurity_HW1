package com.example.mobilesecurity_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class ActivityLoggedIn extends AppCompatActivity {

    private MaterialButton login_BTN_tryagain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        findViews();
    }

    private void findViews()
    {
        login_BTN_tryagain = findViewById(R.id.login_BTN_tryagain);
        login_BTN_tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}