package com.example.cs175group1.workout_buddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Nathaniel on 3/22/2018.
 */

public class Advanced_Workout extends AppCompatActivity implements View.OnClickListener{;
    private Button mondayBtn;
    private Button tuesdayBtn;
    private Button wednesdayBtn;
    private Button thursdayBtn;
    private Button fridayBtn;
    private Button saturdayBtn;
    //private Button sundayBtn;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_workout);

        mondayBtn = findViewById(R.id.mondayBtn);
        tuesdayBtn = findViewById(R.id.tuesdayBtn);
        wednesdayBtn = findViewById(R.id.wednesdayBtn);
        thursdayBtn = findViewById(R.id.thursdayBtn);
        fridayBtn = findViewById(R.id.fridayBtn);
        saturdayBtn = findViewById(R.id.saturdayBtn);

        mondayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_push();
            }
        });
        tuesdayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_pull();
            }
        });
        wednesdayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_legs();
            }
        });
        thursdayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_push();
            }
        });
        fridayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_pull();
            }
        });
        saturdayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_legs();
            }
        });
    }

    private void go_to_push() {
        if(flag) {
            Intent newIntent = new Intent(Advanced_Workout.this, Push_Workout.class);
            startActivity(newIntent);
        }
    }

    private void go_to_pull() {
        if(flag) {
            Intent newIntent = new Intent(Advanced_Workout.this, Pull_Workout.class);
            startActivity(newIntent);
        }
    }

    private void go_to_legs() {
        if(flag) {
            Intent newIntent = new Intent(Advanced_Workout.this, Leg_Workout.class);
            startActivity(newIntent);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mondayBtn:
                go_to_pull();
            case R.id.tuesdayBtn:
                go_to_push();
            case R.id.wednesdayBtn:
                go_to_legs();
            case R.id.thursdayBtn:
                go_to_pull();
            case R.id.fridayBtn:
                go_to_push();
            case R.id.saturdayBtn:
                go_to_legs();
        }
    }
}