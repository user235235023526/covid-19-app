package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2, text3, text4, text5, text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Connected to Firebase!", Toast.LENGTH_LONG).show();

        text1 = findViewById(R.id.date);
        text2 = findViewById(R.id.totalcases);
        text3 = findViewById(R.id.activecases);
        text4 = findViewById(R.id.newcases);
        text5 = findViewById(R.id.recoveries);
        text6 = findViewById(R.id.deaths);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Date");
        DatabaseReference myRef2 = database.getReference("TotalCases");
        DatabaseReference myRef3 = database.getReference("ActiveCases");
        DatabaseReference myRef4 = database.getReference("NewCases");
        DatabaseReference myRef5 = database.getReference("Recoveries");
        DatabaseReference myRef6 = database.getReference("Deaths");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String a = snapshot.getValue(String.class);
                text1.setText(a);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String b = snapshot.getValue(String.class);
                text2.setText(b);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String c = snapshot.getValue(String.class);
                text3.setText(c);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String d = snapshot.getValue(String.class);
                text4.setText(d);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String e = snapshot.getValue(String.class);
                text5.setText(e);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        myRef6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String f = snapshot.getValue(String.class);
                text6.setText(f);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}