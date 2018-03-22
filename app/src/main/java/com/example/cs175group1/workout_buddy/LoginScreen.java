package com.example.cs175group1.workout_buddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginScreen extends AppCompatActivity implements View.OnClickListener{
    EditText userEmail;
    EditText userPassword;
    private Button loginButton;
    public boolean shit = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        userEmail = findViewById(R.id.emailTxt);
        userPassword = findViewById(R.id.passwordTxt);
        loginButton = findViewById(R.id.loginBtn);
        findViewById(R.id.signupBtn).setOnClickListener(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

    }

    private void loginUser() {
        if(shit) {
            Log.d("test:", "see if this is working");
            Intent newIntent = new Intent(LoginScreen.this, HomeActivity.class);
            startActivity(newIntent);
            Log.d("test 2: ", "dangit");
        }
        else {
            Log.d("something broke", "what the");
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loginBtn:
                loginUser();
               // break;
            case R.id.signupBtn:
                break;

        }
    }
}


