package com.example.cs175group1.workout_buddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by Nathaniel on 3/21/2018.
 */

public class Questionnaire extends AppCompatActivity implements View.OnClickListener {
    private WebView formlink;
    private Button backBtn;
    boolean check = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        setTitle("Fitness Questionnaire");


        formlink = (WebView)findViewById(R.id.google);
        backBtn = findViewById(R.id.backBtn);
        WebSettings websettings = formlink.getSettings();
        websettings.setJavaScriptEnabled(true);

        formlink.loadUrl("https://goo.gl/forms/sStPg1mxMGUPLJ3O2");
        formlink.setWebViewClient(new WebViewClient());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_advanced();
            }
        });

    }

    private void go_to_advanced() {
        if(check) {
            Intent newIntent = new Intent(Questionnaire.this, Advanced_Workout.class);
            startActivity(newIntent);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backBtn:
                go_to_advanced();

        }
    }


}
