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

public class Beginner_Workout extends AppCompatActivity implements View.OnClickListener{;
    private Button mondayBtn;
    //private Button tuesdayBtn;
    private Button wednesdayBtn;
    //private Button thursdayBtn;
    private Button fridayBtn;
    //private Button saturdayBtn;
    private Button sundayBtn;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_workout);

        mondayBtn = findViewById(R.id.mondayBtn);
        wednesdayBtn = findViewById(R.id.wednesdayBtn);
        fridayBtn = findViewById(R.id.fridayBtn);
        sundayBtn = findViewById(R.id.sundayBtn);

        mondayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_chest();
            }
        });
        wednesdayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_back();
            }
        });
        fridayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_shoulders();
            }
        });
        sundayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_legs();
            }
        });
    }

    private void go_to_chest() {
        if(flag) {
            Intent newIntent = new Intent(Beginner_Workout.this, Chest_Workout.class);
            startActivity(newIntent);
        }
    }

    private void go_to_back() {
        if(flag) {
            Intent newIntent = new Intent(Beginner_Workout.this, Back_Workout.class);
            startActivity(newIntent);
        }
    }

    private void go_to_shoulders() {
        if(flag) {
            Intent newIntent = new Intent(Beginner_Workout.this, Shoulder_Arm_Workout.class);
            startActivity(newIntent);
        }
    }

    private void go_to_legs() {
        if(flag) {
            Intent newIntent = new Intent(Beginner_Workout.this, Leg_Workout.class);
            startActivity(newIntent);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mondayBtn:
                go_to_chest();
            case R.id.wednesdayBtn:
                go_to_back();
            case R.id.fridayBtn:
                go_to_shoulders();
            case R.id.sundayBtn:
                go_to_legs();
        }
    }
}



