package com.example.codetribe.quizprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        Intent mIntent = getIntent();
        int answ = mIntent.getIntExtra("Answer",-1);
        String kk = mIntent.getStringExtra("wow");
        String kk1 = mIntent.getStringExtra("wow1");
        String kk2 = mIntent.getStringExtra("wow2");

        String answr  = String.format("%d",answ);

String inforDisp= "";

        inforDisp = inforDisp +"Your Results is \n";
        inforDisp = inforDisp +"Game Score : " + answ +"/3"+"\n\n";
        inforDisp = inforDisp +"You Qestion 1 Answer :\n " + kk +"\n\n";
        inforDisp = inforDisp +"You Qestion 2 Answer :\n " + kk1 +"\n\n";
        inforDisp = inforDisp +"You Qestion 3 Answer : \n" + kk2 +"\n\n";

        TextView  textt = (TextView) findViewById(R.id.plk);
            textt.setText(inforDisp);

        }


    }


