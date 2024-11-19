package com.biost.biostudy.Activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.biost.biostudy.Adapter.CoursesAdapter;
import com.biost.biostudy.Domain.CoursesDomain;
import com.biost.biostudy.R;

import java.util.ArrayList;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCoursesList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_courses_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ConstraintLayout back = findViewById(R.id.back);
        back.setOnClickListener(v -> startActivity(new Intent(CoursesListActivity.this, MainActivity.class)));

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Vital Signs Monitors Guide", "A device to measure and display vital signs like heart rate, blood pressure, and oxygen levels", "g1"));
        items.add(new CoursesDomain("Infusion Pump Guide", "Machines that deliver fluids, such as medications, directly into the patient’s body.", "g2"));
        items.add(new CoursesDomain("Anatomy and Physiology Guide", "Provides a foundational understanding of human anatomy and physiology,", "g3"));
        items.add(new CoursesDomain("Blood Pressure Monitor Guide", "Devices used to measure the force of blood against the walls of arteries", "g4"));
        items.add(new CoursesDomain("Pulse Oximeter Guide", "Devices that measure the oxygen saturation level (SpO₂) in the blood and the pulse rate.", "g5"));
        items.add(new CoursesDomain("X-Ray Machines Guide", "Devices that use radiation to visualize bones and dense structures.", "g6"));
        items.add(new CoursesDomain("MRI Machines Guide", "Magnetic Resonance Imaging devices for high-resolution images of soft tissues.", "g8"));
        items.add(new CoursesDomain("Ultrasound Machines Guide", "Equipment that uses sound waves to create images of internal body structures.", "g9"));
        items.add(new CoursesDomain("Vital Signs Monitors Guide", "A device to measure and display vital signs like heart rate, blood pressure, and oxygen levels", "p1"));
        items.add(new CoursesDomain("Infusion Pump Guide", "Machines that deliver fluids, such as medications, directly into the patient’s body.", "p2"));
        items.add(new CoursesDomain("Anatomy and Physiology Guide", "Provides a foundational understanding of human anatomy and physiology,", "vl1"));
        items.add(new CoursesDomain("Blood Pressure Monitor Guide", "Devices used to measure the force of blood against the walls of arteries", "vl2"));
        items.add(new CoursesDomain("Pulse Oximeter Guide", "Devices that measure the oxygen saturation level (SpO₂) in the blood and the pulse rate.", "vl2"));
        items.add(new CoursesDomain("X-Ray Machines Guide", "Devices that use radiation to visualize bones and dense structures.", "vl3"));
        items.add(new CoursesDomain("MRI Machines Guide", "Magnetic Resonance Imaging devices for high-resolution images of soft tissues.", "vl4"));
        items.add(new CoursesDomain("Ultrasound Machines Guide", "Equipment that uses sound waves to create images of internal body structures.", "vl5"));
        items.add(new CoursesDomain("X-Ray Machines Guide", "Devices that use radiation to visualize bones and dense structures.", "vl6"));
        items.add(new CoursesDomain("MRI Machines Guide", "Magnetic Resonance Imaging devices for high-resolution images of soft tissues.", "vl7"));
        recyclerViewCourse = findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterCoursesList = new CoursesAdapter(items, this);
        recyclerViewCourse.setAdapter(adapterCoursesList);
    }
}