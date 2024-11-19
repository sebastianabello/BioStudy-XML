package com.biost.biostudy.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.biost.biostudy.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ImageView startBtn = findViewById(R.id.startbtn);
        startBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, MainActivity.class)));




    }
}