package com.example.myapplication;

import static com.example.myapplication.R.id.linearLayout12312;
import static com.example.myapplication.R.id.linearLayout3132;
import static com.example.myapplication.R.id.linearLayout3133;
import static com.example.myapplication.R.id.linearLayout3134;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {

    private LinearLayout linearLayout, linearLayout2, linearLayout3, linearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        linearLayout = findViewById(linearLayout3132);
        linearLayout2 = findViewById(linearLayout3133);
        linearLayout3 = findViewById(linearLayout3134);
        linearLayout4 = findViewById(linearLayout12312);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStats();
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVaccine();
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHotlines();
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelfAssessment();
            }
        });
    }

    public void openStats() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openVaccine() {
        Intent intent = new Intent(this, VaccineActivity.class);
        startActivity(intent);
    }

    public void openHotlines() {
        Intent intent = new Intent(this, Hotlines.class);
        startActivity(intent);
    }

    public void openSelfAssessment() {
        Intent intent = new Intent(this, SelfAssessment.class);
        startActivity(intent);
    }
}