package com.gradeCalculator.gradeandgpacalculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.gradeCalculator.gradeandgpacalculator.GPActivity.fromGPA;

public class GradeCalculatorActivity extends AppCompatActivity {
    private EditText[] names, weight, grade;
    private android.support.design.widget.FloatingActionButton[] addBTNs;
    private int current=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        names= new EditText[10]; //Stores the names of the evaulations in the course
        weight=new EditText[10]; //Stores the weight of each eavualtion for the course 
        grade= new EditText[10]; //Stores the grade recieved for each evaluation for the course 
        addBTNs= new android.support.design.widget.FloatingActionButton[9]; //Stores the buttons to add a new evaluation

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradecalculator);


        names[0]=findViewById(R.id.etxtEvName1);
        names[1]=findViewById(R.id.etxtEvName2);
        names[2]=findViewById(R.id.etxtEvName3);
        names[3]=findViewById(R.id.etxtEvName4);
        names[4]=findViewById(R.id.etxtEvName5);
        names[5]=findViewById(R.id.etxtEvName6);
        names[6]=findViewById(R.id.etxtEvName7);
        names[7]=findViewById(R.id.etxtEvName8);
        names[8]=findViewById(R.id.etxtEvName9);
        names[9]=findViewById(R.id.etxtEvName10);

        grade[0]=findViewById(R.id.etxtGrade1);
        grade[1]=findViewById(R.id.etxtGrade2);
        grade[2]=findViewById(R.id.etxtGrade3);
        grade[3]=findViewById(R.id.etxtGrade4);
        grade[4]=findViewById(R.id.etxtGrade5);
        grade[5]=findViewById(R.id.etxtGrade6);
        grade[6]=findViewById(R.id.etxtGrade7);
        grade[7]=findViewById(R.id.etxtGrade8);
        grade[8]=findViewById(R.id.etxtGrade9);
        grade[9]=findViewById(R.id.etxtGrade10);

        weight[0]=findViewById(R.id.etxtWeight1);
        weight[1]=findViewById(R.id.etxtWeight2);
        weight[2]=findViewById(R.id.etxtWeight3);
        weight[3]=findViewById(R.id.etxtWeight4);
        weight[4]=findViewById(R.id.etxtWeight5);
        weight[5]=findViewById(R.id.etxtWeight6);
        weight[6]=findViewById(R.id.etxtWeight7);
        weight[7]=findViewById(R.id.etxtWeight8);
        weight[8]=findViewById(R.id.etxtWeight9);
        weight[9]=findViewById(R.id.etxtWeight10);

        addBTNs[0]=findViewById(R.id.btnAddEv1);
        addBTNs[1]=findViewById(R.id.btnAddEv2);
        addBTNs[2]=findViewById(R.id.btnAddEv3);
        addBTNs[3]=findViewById(R.id.btnAddEv4);
        addBTNs[4]=findViewById(R.id.btnAddEv5);
        addBTNs[5]=findViewById(R.id.btnAddEv6);
        addBTNs[6]=findViewById(R.id.btnAddEv7);
        addBTNs[7]=findViewById(R.id.btnAddEv8);
        addBTNs[8]=findViewById(R.id.btnAddEv9);

        if (fromGPA){
            findViewById(R.id.btnGradeHome).setVisibility(View.INVISIBLE);
            findViewById(R.id.txtNeededGrade).setVisibility(View.INVISIBLE);
            findViewById(R.id.etxtGradeWant).setVisibility(View.INVISIBLE);
            findViewById(R.id.txtWant).setVisibility(View.INVISIBLE);
            findViewById(R.id.btnCalculate).setVisibility(View.INVISIBLE);
            findViewById(R.id.btnCalculate2).setVisibility(View.VISIBLE);
        }

        for (int x=1; x<10; x++){
            names[x].setVisibility(View.INVISIBLE);
            grade[x].setVisibility(View.INVISIBLE);
            weight[x].setVisibility(View.INVISIBLE);

            if (x<9) addBTNs[x].hide();
        }
        findViewById(R.id.btnEdit).setVisibility(View.INVISIBLE);


    }

    public void addEvaluation(View view) {
        if (current<10) {
            names[current].setVisibility(View.VISIBLE);
            grade[current].setVisibility(View.VISIBLE);
            weight[current].setVisibility(View.VISIBLE);
            if (current<9) addBTNs[current].show();
            addBTNs[current - 1].hide();
            current++;
        }
    }
    public void onClickCalculateGrade (View view){
        GradeCalculator gradeCalculator= new GradeCalculator();
        EditText gradeWant= (EditText) findViewById(R.id.etxtGradeWant);
        Double need=0.0;
        Grades grades= new Grades();

        AlertDialog.Builder alert=new AlertDialog.Builder(GradeCalculatorActivity.this);
        alert.setCancelable(true);
        boolean incomplete=false;

        if (this.current>0 && !incomplete) {
            EditText credit1 = findViewById(R.id.etxtWeight1);
            EditText grade1 = findViewById(R.id.etxtGrade1);
            if (grade1.getText().toString().isEmpty() || credit1.getText().toString().isEmpty()){
                alert.setTitle("Your 1st Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 1st evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade1.getText().toString()), Double.parseDouble(credit1.getText().toString()) / 100));
        }
        if (this.current>1&& !incomplete) {
            EditText credit2 = findViewById(R.id.etxtWeight2);
            EditText grade2 = findViewById(R.id.etxtGrade2);
            if (grade2.getText().toString().isEmpty() || credit2.getText().toString().isEmpty()){
                alert.setTitle("Your 2nd Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 2nd evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade2.getText().toString()), Double.parseDouble(credit2.getText().toString()) / 100));
        }
        if (this.current>2&& !incomplete) {
            EditText credit3 = findViewById(R.id.etxtWeight3);
            EditText grade3 = findViewById(R.id.etxtGrade3);
            if (grade3.getText().toString().isEmpty() || credit3.getText().toString().isEmpty()){
                alert.setTitle("Your 3rd Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 3rd evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade3.getText().toString()), Double.parseDouble(credit3.getText().toString()) / 100));
        }
        if (this.current>3&& !incomplete) {
            EditText credit4 = findViewById(R.id.etxtWeight4);
            EditText grade4 = findViewById(R.id.etxtGrade4);
            if (grade4.getText().toString().isEmpty() || credit4.getText().toString().isEmpty()){
                alert.setTitle("Your 4th Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 4th evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade4.getText().toString()), Double.parseDouble(credit4.getText().toString()) / 100));
        }
        if (this.current>4&& !incomplete) {
            EditText credit5 = findViewById(R.id.etxtWeight5);
            EditText grade5 = findViewById(R.id.etxtGrade5);
            if (grade5.getText().toString().isEmpty() || credit5.getText().toString().isEmpty()){
                alert.setTitle("Your 5th Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 5th evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade5.getText().toString()), Double.parseDouble(credit5.getText().toString()) / 100));
        }
        if (this.current>5&& !incomplete) {
            EditText credit6 = findViewById(R.id.etxtWeight6);
            EditText grade6 = findViewById(R.id.etxtGrade6);
            if (grade6.getText().toString().isEmpty() || credit6.getText().toString().isEmpty()){
                alert.setTitle("Your 6th Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 6th evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade6.getText().toString()), Double.parseDouble(credit6.getText().toString()) / 100));
        }
        if (this.current>6&& !incomplete) {
            EditText credit7 = findViewById(R.id.etxtWeight7);
            EditText grade7 = findViewById(R.id.etxtGrade7);
            if (grade7.getText().toString().isEmpty() || credit7.getText().toString().isEmpty()){
                alert.setTitle("Your 7th Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 7th evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade7.getText().toString()), Double.parseDouble(credit7.getText().toString()) / 100));
        }
        if (this.current>7&& !incomplete) {
            EditText credit8 = findViewById(R.id.etxtWeight8);
            EditText grade8 = findViewById(R.id.etxtGrade8);
            if (grade8.getText().toString().isEmpty() || credit8.getText().toString().isEmpty()){
                alert.setTitle("Your 8th Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 8th evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade8.getText().toString()), Double.parseDouble(credit8.getText().toString()) / 100));
        }
        if (this.current>8&& !incomplete) {
            EditText credit9 = findViewById(R.id.etxtWeight9);
            EditText grade9 = findViewById(R.id.etxtGrade9);
            if (grade9.getText().toString().isEmpty() || credit9.getText().toString().isEmpty()){
                alert.setTitle("Your 9th Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 9th evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade9.getText().toString()), Double.parseDouble(credit9.getText().toString()) / 100));
        }
        if (this.current==9&& !incomplete) {
            EditText credit10 = findViewById(R.id.etxtWeight10);
            EditText grade10 = findViewById(R.id.etxtGrade10);
            if (grade10.getText().toString().isEmpty() || credit10.getText().toString().isEmpty()){
                alert.setTitle("Your 10th Evaluation Entry is Not Complete");
                alert.setMessage("Please complete both the weight and grade section for your 10th evaluation");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade10.getText().toString()), Double.parseDouble(credit10.getText().toString()) / 100));
        }
        if (!incomplete) {
            findViewById(R.id.txtNeededGrade).setVisibility(View.VISIBLE);
            findViewById(R.id.txtNeededGrade).bringToFront();
            findViewById(R.id.txtGradeNeed).setVisibility(View.VISIBLE);
            findViewById(R.id.txtGradeNeed).bringToFront();
            findViewById(R.id.etxtGradeWant).setVisibility(View.INVISIBLE);
            findViewById(R.id.txtWant).setVisibility(View.INVISIBLE);
            if (gradeWant.getText().toString().matches("")) {
                if (gradeCalculator.calculateCredit(grades) == 1){
                    ((TextView) findViewById(R.id.txtNeededGrade)).setText("Your Grade:");
                    need = gradeCalculator.calculatorWithFinal(grades);
                    findViewById(R.id.txtWant).setVisibility(View.INVISIBLE);
                    findViewById(R.id.etxtGradeWant).setVisibility(View.INVISIBLE);
                }
                else {
                    alert.setTitle("Your Course is Not Complete");
                    if (fromGPA)alert.setMessage("Your evaluations do not add up to 100%. Either re-weight or add evaluations.");
                    else alert.setMessage("Your evaluations do not add up to 100%. Either re-weight or add evaluations, or enter a grade you want to finish the course with to calculate what you need on the final.");
                    alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    alert.show();
                    incomplete=true;
                }
            }
            else {
                Double want = Double.parseDouble(gradeWant.getText().toString());
                need = gradeCalculator.calculatorWithoutFinal(grades, want);
            }
            if (need > 100 && !incomplete) {
                ((TextView) findViewById(R.id.txtGradeNeed)).setText("Not Possible");
            } else if (!incomplete){
                ((TextView) findViewById(R.id.txtGradeNeed)).setText(need.toString());
            }

            if (fromGPA && !incomplete){
                fromGPA=false;
                Intent mainIntent= new Intent(GradeCalculatorActivity.this, GPActivity.class);
                mainIntent.putExtra("answer", need);
                setResult(Activity.RESULT_OK,mainIntent);
                finish();
            }
            else if(!incomplete){
                for (int x = 0; x < 10; x++) {
                    names[x].setEnabled(false);
                    grade[x].setEnabled(false);
                    weight[x].setEnabled(false);
                    if (x < 9) addBTNs[x].setEnabled(false);
                }
                findViewById(R.id.etxtGradeWant).setEnabled(false);
                findViewById(R.id.btnCalculate).setVisibility(View.INVISIBLE);
                findViewById(R.id.btnEdit).setVisibility(View.VISIBLE);
            }
        }
    }
    public void RestartOnClick(View view){
        Intent restartIntent= new Intent(GradeCalculatorActivity.this, GradeCalculatorActivity.class);
        GradeCalculatorActivity.this.startActivity(restartIntent);
    }
    public void homeOnClick(View view){
        Intent mainIntent= new Intent(GradeCalculatorActivity.this, MainActivity.class);
        GradeCalculatorActivity.this.startActivity(mainIntent);
    }
    public void editOnClick(View view){
        findViewById(R.id.btnCalculate).setVisibility(View.VISIBLE);
        findViewById(R.id.btnEdit).setVisibility(View.INVISIBLE);
        ((TextView)findViewById(R.id.txtGradeNeed)).setText("");
        ((TextView) findViewById(R.id.txtNeededGrade)).setText("Grade you Need:");
        for (int x=0; x<10; x++){
            names[x].setEnabled(true);
            grade[x].setEnabled(true);
            weight[x].setEnabled(true);
            if (x<9) addBTNs[x].setEnabled(true);
        }
        findViewById(R.id.etxtGradeWant).setEnabled(true);
        findViewById(R.id.txtWant).setVisibility(View.VISIBLE);
        findViewById(R.id.etxtGradeWant).setVisibility(View.VISIBLE);
        findViewById(R.id.txtGradeNeed).setVisibility(View.INVISIBLE);
        findViewById(R.id.txtNeededGrade).setVisibility(View.INVISIBLE);
    }

}
