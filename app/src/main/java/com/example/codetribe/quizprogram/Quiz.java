package com.example.codetribe.quizprogram;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Quiz extends AppCompatActivity {
    String quiz;
    int answer,i;
    boolean q1=false,q2=false,q3=false;

String category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();




       String Name;
        quiz = intent.getStringExtra("quiz");


//if (quiz==cars)
        switch(quiz){
            case "cars":
                    q1=true;
                getSupportActionBar().setTitle("Car Quiz!");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

                    q2=true;

                getSupportActionBar().setTitle("Mathematics Quiz!");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                TextView b1 = (TextView) findViewById(R.id.Q1);
                b1.setText("Whats the Answer of 2+3(5-1)");
                RadioButton bb = (RadioButton) findViewById(R.id.A1);
                bb.setText("9");
                RadioButton ac = (RadioButton) findViewById(R.id.A2);
                ac.setText("7");
                RadioButton dc = (RadioButton) findViewById(R.id.A3);
                dc.setText("4");

                TextView b2 = (TextView) findViewById(R.id.Q2);
                b2.setText("The number of 3-digit numbers divisible by 6");
                RadioButton q = (RadioButton) findViewById(R.id.B1);
                q.setText("149");
                RadioButton g = (RadioButton) findViewById(R.id.B2);
                g.setText("166");

                TextView b3 = (TextView) findViewById(R.id.Q3);
                b3.setText("With the following numbers gives 240 when added to its own square?");
                RadioButton y = (RadioButton) findViewById(R.id.C1);
                y.setText("5002");
                RadioButton q1 = (RadioButton) findViewById(R.id.C2);
                q1.setText("520");
                RadioButton w2 = (RadioButton) findViewById(R.id.C3);
                w2.setText("502");

                break;
            case "computer":
                q3=true;

                getSupportActionBar().setTitle("Computer Quiz!");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                TextView c1 = (TextView) findViewById(R.id.Q1);
                c1.setText("An ISP stand for:");
                RadioButton dcc = (RadioButton) findViewById(R.id.A1);
                dcc.setText("Internet Security Protocol");
                RadioButton cc = (RadioButton) findViewById(R.id.A2);
                cc.setText("Internet Service Provider");
                RadioButton cd = (RadioButton) findViewById(R.id.A3);
                cd.setText("Intergrated Service Provider");

                TextView c2 = (TextView) findViewById(R.id.Q2);
                c2.setText("On which of the following site can you set up your email account:");
                RadioButton c = (RadioButton) findViewById(R.id.B1);
                c.setText("www.linux.org");
                RadioButton cg = (RadioButton) findViewById(R.id.B2);
                cg.setText("www.gres.com");
                RadioButton ch = (RadioButton) findViewById(R.id.B3);
                ch.setText("www.hotmail.com");

                TextView c3 = (TextView) findViewById(R.id.Q3);
                c3.setText("A computer on the internet that hosts data that can be accesssed by web browser using HTTP is known as:");
                RadioButton cy = (RadioButton) findViewById(R.id.C1);
                cy.setText("Web pace");
                RadioButton qc = (RadioButton) findViewById(R.id.C2);
                qc.setText("Web server");
                RadioButton wc = (RadioButton) findViewById(R.id.C3);
                wc.setText("web Rack");

                break;
        }

    }

    String names,names1,names2,corrAns;

    public void question1(View v){



        if(q1==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {

                case R.id.A1:


                    if (checked) {
                        i+= 1;

                        names = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i+= 0;
                    names = ((RadioButton) v).getText().toString();
                    break;

            }
        }else if(q2==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.A3:

                    if (checked) {
                        i+= 1;
                        names = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i+= 0;
                    names = ((RadioButton) v).getText().toString();
                    break;
            }
        }else if(q3==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.A2:

                    if (checked) {
                        i+= 1;
                        names = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i+= 0;
                    names = ((RadioButton) v).getText().toString();
                    break;


            }
        }

    }
    public void question2(View v){


        if(q1==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.B3:

                    if (checked) {
                        i += 1;
                        names1 = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i += 0;
                    names1 = ((RadioButton) v).getText().toString();
                    break;

            }
        }else if(q2==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.B2:

                    if (checked) {
                        i += 1;
                        names1 = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i += 0;
                    names1 = ((RadioButton) v).getText().toString();
                    break;
            }
        }else if(q3==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.B2:

                    if (checked) {
                        i+= 1;

                        names1 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i+= 0;
                    names1 = ((RadioButton) v).getText().toString();
                    break;


            }
        }

    }
    public void question3(View v){

        if(q1==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.C2:

                    if (checked) {
                        i+= 1;
                        names2 = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i+= 0;
                    names2 = ((RadioButton) v).getText().toString();
                    break;

            }
        }else if(q2==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.C1:

                    if (checked) {
                        i+= 1;
                        names2 = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i+= 0;
                    names2 = ((RadioButton) v).getText().toString();
                    break;
            }
        }else if(q3==true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.C3:

                    if (checked) {
                        i+= 1;
                        names2 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i+= 0;
                    names2 = ((RadioButton) v).getText().toString();
                    break;


            }
        }

    }

    public void submit(View v) {
       answer= i;

        RadioGroup comp  = (RadioGroup) findViewById(R.id.grp1);
        RadioGroup comp1  = (RadioGroup)findViewById(R.id.grp2);
        RadioGroup comp2 = (RadioGroup)findViewById(R.id.grp3);

      int name = comp.getCheckedRadioButtonId();
        int name1 = comp1.getCheckedRadioButtonId();
        int name2 = comp2.getCheckedRadioButtonId();
        if(name!=-1 && name1 !=-1 && name2!=-1) {

            Intent intent = new Intent(this, Results.class);
            intent.putExtra("Answer", (int) answer);
            intent.putExtra("norma", corrAns);
            intent.putExtra("wow", names);
            intent.putExtra("wow1", names1);
            intent.putExtra("wow2", names2);
            intent.putExtra("quiz",quiz);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Answer All Questions", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}




