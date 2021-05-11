package com.example.psyche;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Window;
import android.widget.Button;

public class OnboardingScreen extends AppCompatActivity {


    Button open_questionnaire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_onboarding_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        open_questionnaire = findViewById(R.id.openQuestionnaire);
        open_questionnaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showQuestionnaireScreen();
            }
        });
    }

    public void showQuestionnaireScreen(){
        Intent intent = new Intent(this, Questionnaire.class);
        startActivity(intent);
    }

}