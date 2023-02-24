package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Hotlines extends AppCompatActivity {

    private Button callbutton1, callbutton2, callbutton3, callbutton4, callbutton5, callbutton6, callbutton7, callbutton8, callbutton9, callbutton10,
    callbutton11, callbutton12, callbutton13, callbutton14, callbutton15, callbutton16, callbutton17, callbutton18, callbutton19, callbutton20,
    callbutton21, callbutton22;

    private TextView number1, number2, number3, number4, number5, number6, number7, number8, number9, number10, number11, number12, number13, number14,
    number15, number16, number17, number18, number19, number20, number21, number22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotlines);

        callbutton1 = findViewById(R.id.callbutton1);
        callbutton2 = findViewById(R.id.callbutton2);
        callbutton3 = findViewById(R.id.callbutton3);
        callbutton4 = findViewById(R.id.callbutton4);
        callbutton5 = findViewById(R.id.callbutton5);
        callbutton6 = findViewById(R.id.callbutton6);
        callbutton7 = findViewById(R.id.callbutton7);
        callbutton8 = findViewById(R.id.callbutton8);
        callbutton9 = findViewById(R.id.callbutton9);
        callbutton10 = findViewById(R.id.callbutton10);
        callbutton11 = findViewById(R.id.callbutton11);
        callbutton12 = findViewById(R.id.callbutton12);
        callbutton13 = findViewById(R.id.callbutton13);
        callbutton14 = findViewById(R.id.callbutton14);
        callbutton15 = findViewById(R.id.callbutton15);
        callbutton16 = findViewById(R.id.callbutton16);
        callbutton17 = findViewById(R.id.callbutton17);
        callbutton18 = findViewById(R.id.callbutton18);
        callbutton19 = findViewById(R.id.callbutton19);
        callbutton20 = findViewById(R.id.callbutton20);
        callbutton21 = findViewById(R.id.callbutton21);
        callbutton22 = findViewById(R.id.callbutton22);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        number7 = findViewById(R.id.number7);
        number8 = findViewById(R.id.number8);
        number9 = findViewById(R.id.number1);
        number10 = findViewById(R.id.number2);
        number11 = findViewById(R.id.number3);
        number12 = findViewById(R.id.number4);
        number13 = findViewById(R.id.number1);
        number14 = findViewById(R.id.number2);
        number15 = findViewById(R.id.number3);
        number16 = findViewById(R.id.number4);
        number17 = findViewById(R.id.number1);
        number18 = findViewById(R.id.number2);
        number19 = findViewById(R.id.number3);
        number20 = findViewById(R.id.number4);
        number21 = findViewById(R.id.number3);
        number22 = findViewById(R.id.number4);


        callbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num1));
                startActivity(intent);
            }
        });
        callbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num2 = number2.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num2));
                startActivity(intent);
            }
        });
        callbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num3 = number3.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num3));
                startActivity(intent);
            }
        });
        callbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num4 = number4.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num4));
                startActivity(intent);
            }
        });
        callbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num5 = number5.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num5));
                startActivity(intent);
            }
        });
        callbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num6 = number6.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num6));
                startActivity(intent);
            }
        });
        callbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num7 = number7.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num7));
                startActivity(intent);
            }
        });
        callbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num8 = number8.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num8));
                startActivity(intent);
            }
        });
        callbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num9 = number9.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num9));
                startActivity(intent);
            }
        });
        callbutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num10 = number10.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num10));
                startActivity(intent);
            }
        });
        callbutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num11 = number11.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num11));
                startActivity(intent);
            }
        });
        callbutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num12 = number12.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num12));
                startActivity(intent);
            }
        });
        callbutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num13 = number13.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num13));
                startActivity(intent);
            }
        });
        callbutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num15 = number15.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num15));
                startActivity(intent);
            }
        });
        callbutton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num15 = number15.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num15));
                startActivity(intent);
            }
        });
        callbutton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num16 = number16.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num16));
                startActivity(intent);
            }
        });
        callbutton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num17 = number17.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num17));
                startActivity(intent);
            }
        });
        callbutton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num18 = number18.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num18));
                startActivity(intent);
            }
        });
        callbutton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num19 = number19.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num19));
                startActivity(intent);
            }
        });
        callbutton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num20 = number20.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num20));
                startActivity(intent);
            }
        });
        callbutton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num21 = number21.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num21));
                startActivity(intent);
            }
        });
        callbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num22 = number22.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + num22));
                startActivity(intent);
            }
        });

    }
}