package com.example.myapplication;

import static android.graphics.Color.GRAY;
import static com.example.myapplication.R.color.accent;
import static com.example.myapplication.R.color.main;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelfAssessment extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button yes, no;
    Button submitBtn;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_assessment);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        yes = findViewById(R.id.yesButton);
        no = findViewById(R.id.noButton);
        submitBtn = findViewById(R.id.submit_btn);

        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions : "+totalQuestion);

        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {

        yes.setBackgroundColor(Color.WHITE);
        no.setBackgroundColor(Color.WHITE);


        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(QuestionAnswer.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        } else {
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(GRAY);
        }
    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
        yes.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        no.setText(QuestionAnswer.choices[currentQuestionIndex][1]);


    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Your symptoms require emergency medical care";
            new AlertDialog.Builder(this)
                    .setTitle(passStatus)
                    .setMessage("Call the COVID-19 hotline in your municipality and get tested right away.")
                    .setPositiveButton("COVID-19 Hotline", (dialogInterface, i) -> Hotline())
                    .setCancelable(false)
                    .show();
        } else {
            passStatus = "No symptoms of COVID-19 were identified";
            new AlertDialog.Builder(this)
                    .setTitle(passStatus)
                    .setMessage("Continue to follow health guidelines to stay safe.")
                    .setPositiveButton("Back", (dialogInterface, i) -> Back())
                    .setCancelable(false)
                    .show();
        }
    }

    void Back(){
        score = 0;
        currentQuestionIndex =0;
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    void Hotline() {
        score = 0;
        currentQuestionIndex =0;
        Intent intent = new Intent(this, Hotlines.class);
        startActivity(intent);
    }

}