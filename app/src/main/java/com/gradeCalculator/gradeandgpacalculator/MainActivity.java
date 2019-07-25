package com.gradeCalculator.gradeandgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.util.Log.*;

//This is the main menu screen
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //If the Grade Calculator Buttom is pressed then start its Activity
    public void btnGradeCalculatorOnClick(View view){
        Intent gradeIntent= new Intent(MainActivity.this, GradeCalculatorActivity.class);
        MainActivity.this.startActivity(gradeIntent);
    }
    
    //If the GPA Calculator Buttom is pressed then start its Activity
    public void btnGPAOnClick(View view){
        Intent gradeIntent= new Intent(MainActivity.this, GPActivity.class);
        MainActivity.this.startActivity(gradeIntent);
    }
}
