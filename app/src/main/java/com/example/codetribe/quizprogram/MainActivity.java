package com.example.codetribe.quizprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
String categories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void car(View v){
        categories = "cars";
        Intent i = new Intent(getApplicationContext(),Quiz.class);
        i.putExtra("quiz",categories);
        startActivity(i);
    }

    public void math(View v){

        categories = "mathematics";
        Intent m  = new Intent(getApplicationContext(), Quiz.class);
        m.putExtra("quiz", categories);
        startActivity(m);
    }

    public void comp(View v){

        categories = "computer";
        Intent l  = new Intent(getApplicationContext(), Quiz.class);
        l.putExtra("quiz", categories);
        startActivity(l);
    }



}
