package com.biost.biostudy.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.biost.biostudy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ConstraintLayout btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

        ConstraintLayout btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));
    }
}