package com.example.codetribe.quizprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Quiz extends AppCompatActivity {

String category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        Intent intent = getIntent();

        String quiz  = intent.getStringExtra("quiz");

        switch(quiz){
            case "cars":

                getSupportActionBar().setTitle("Car Quiz!");

                TextView a1 = (TextView) findViewById(R.id.Q1);
                a1.setText("What Does BMW stand for");
                RadioButton rad = (RadioButton) findViewById(R.id.A1);
                rad.setText("BB");
                RadioButton a = (RadioButton) findViewById(R.id.A2);
                a.setText("JJ");
                RadioButton d = (RadioButton) findViewById(R.id.A3);
                d.setText("CC");

                TextView a2 = (TextView) findViewById(R.id.Q2);
                a2.setText("What is the mazda's first model");
                RadioButton rads = (RadioButton) findViewById(R.id.B1);
                rads.setText("AAAAAhh");
                RadioButton as = (RadioButton) findViewById(R.id.B2);
                as.setText("AHeeee");
                RadioButton ds = (RadioButton) findViewById(R.id.B3);
                ds.setText("OHOOO");

                TextView a3 = (TextView) findViewById(R.id.Q3);
                a3.setText("Hellow");
                RadioButton ra = (RadioButton) findViewById(R.id.C1);
                ra.setText("BB");
                RadioButton b = (RadioButton) findViewById(R.id.C2);
                b.setText("JJ");
                RadioButton v = (RadioButton) findViewById(R.id.C3);
                v.setText("CC");
                break;
            case "mathematics":

                getSupportActionBar().setTitle("Mathematics Quiz!");

                TextView b1 = (TextView) findViewById(R.id.Q1);
                b1.setText("Whats the Answer of 2+3(5-1)");
                RadioButton bb = (RadioButton) findViewById(R.id.A1);
                bb.setText("9");
                RadioButton ac = (RadioButton) findViewById(R.id.A2);
                ac.setText("7");
                RadioButton dc = (RadioButton) findViewById(R.id.A3);
                dc.setText("4");

                TextView b2 = (TextView) findViewById(R.id.Q2);
                b2.setText("What is the answer for 1+1-1+2");
                RadioButton q = (RadioButton) findViewById(R.id.B1);
                q.setText("0");
                RadioButton g = (RadioButton) findViewById(R.id.B2);
                g.setText("2");
                RadioButton h = (RadioButton) findViewById(R.id.B3);
                h.setText("1");

                TextView b3 = (TextView) findViewById(R.id.Q3);
                b3.setText("What are numbers that make 9");
                RadioButton y = (RadioButton) findViewById(R.id.C1);
                y.setText("2+3*2");
                RadioButton q1 = (RadioButton) findViewById(R.id.C2);
                q1.setText("3*3+4");
                RadioButton w2 = (RadioButton) findViewById(R.id.C3);
                w2.setText("2+3*3+1");

                break;
            case "computer":

                getSupportActionBar().setTitle("Computer Quiz!");


                TextView c1 = (TextView) findViewById(R.id.Q1);
                c1.setText("HAAAH");

                TextView c2 = (TextView) findViewById(R.id.Q2);
                c2.setText("JOOOOH");
                TextView c3 = (TextView) findViewById(R.id.Q3);
                c3.setText("JOOOOH");

                break;
        }

    }

    }




