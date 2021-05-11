package com.example.psyche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class OpeningScreen extends AppCompatActivity {


    Button new_user;
    Button returning_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //temp
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_opening_screen);

        new_user = findViewById(R.id.newUser);
        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOnboardingScreen();
            }
        });


    }

    public void showOnboardingScreen(){
        Intent intent = new Intent(this, OnboardingScreen.class);
        startActivity(intent);
    }

}