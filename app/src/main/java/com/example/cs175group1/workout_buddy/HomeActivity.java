package com.example.cs175group1.workout_buddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button workoutBtn;
    private Button questBtn;
    private Button homeBtn;
    private Button logoutBtn;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);

        workoutBtn = findViewById(R.id.workoutBtn);
        questBtn = findViewById(R.id.questBtn);
        homeBtn = findViewById(R.id.homeBtn);
        logoutBtn = findViewById(R.id.logoutBtn);

        workoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_workout();
            }
        });
        questBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_quest();
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_home();
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_logout();
            }
        });
    }

    private void go_to_workout() {
        if(flag) {
            Intent newIntent = new Intent(HomeActivity.this, Questionnaire.class);
            startActivity(newIntent);
        }
        else {
            Log.d("something broke", "wtf");
        }
    }

    private void go_to_quest() {
        if(flag) {
            Intent newIntent = new Intent(HomeActivity.this, Questionnaire.class);
            startActivity(newIntent);
        }
        else {
            Log.d("something broke", "wtf");
        }
    }

    private void go_to_home() {
        if(flag) {
            //Intent newIntent = new Intent(HomeActivity.this, HomeActivity.class);
            //startActivity(newIntent);
        }
        else {
            Log.d("something broke", "wtf");
        }
    }

    private void go_to_logout() {
        if(flag) {
            Intent newIntent = new Intent(HomeActivity.this, LoginScreen.class);
            startActivity(newIntent);
        }
        else {
            Log.d("something broke", "wtf");
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.homeBtn:
                go_to_home();
            case R.id.workoutBtn:
                go_to_workout();
            case R.id.questBtn:
                go_to_quest();
            case R.id.logoutBtn:
                go_to_logout();
        }
    }
}