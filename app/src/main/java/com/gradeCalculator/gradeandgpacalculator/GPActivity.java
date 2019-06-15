package com.gradeCalculator.gradeandgpacalculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class GPActivity extends AppCompatActivity {
    public static boolean fromGPA=false;
    public static double gradeGot=0;
    private Spinner provinceSpinner;
    private EditText[] names, weight, grade;
    private Button[] btnGoToGradeCalculator;
    private android.support.design.widget.FloatingActionButton[] addBTNs;
    private int current=1;
    private int button=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        names= new EditText[40];
        weight=new EditText[40];
        grade= new EditText[40];
        btnGoToGradeCalculator= new Button[40];

        addBTNs= new android.support.design.widget.FloatingActionButton[39];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpacalulator);
        findViewById(R.id.btnEdit).setVisibility(View.INVISIBLE);

        names[0]=findViewById(R.id.etxtCourse1);
        names[1]=findViewById(R.id.etxtCourse2);
        names[2]=findViewById(R.id.etxtCourse3);
        names[3]=findViewById(R.id.etxtCourse4);
        names[4]=findViewById(R.id.etxtCourse5);
        names[5]=findViewById(R.id.etxtCourse6);
        names[6]=findViewById(R.id.etxtCourse7);
        names[7]=findViewById(R.id.etxtCourse8);
        names[8]=findViewById(R.id.etxtCourse9);
        names[9]=findViewById(R.id.etxtCourse10);
        names[10]=findViewById(R.id.etxtCourse11);
        names[11]=findViewById(R.id.etxtCourse12);
        names[12]=findViewById(R.id.etxtCourse13);
        names[13]=findViewById(R.id.etxtCourse14);
        names[14]=findViewById(R.id.etxtCourse15);
        names[15]=findViewById(R.id.etxtCourse16);
        names[16]=findViewById(R.id.etxtCourse17);
        names[17]=findViewById(R.id.etxtCourse18);
        names[18]=findViewById(R.id.etxtCourse19);
        names[19]=findViewById(R.id.etxtCourse20);
        names[20]=findViewById(R.id.etxtCourse21);
        names[21]=findViewById(R.id.etxtCourse22);
        names[22]=findViewById(R.id.etxtCourse23);
        names[23]=findViewById(R.id.etxtCourse24);
        names[24]=findViewById(R.id.etxtCourse25);
        names[25]=findViewById(R.id.etxtCourse26);
        names[26]=findViewById(R.id.etxtCourse27);
        names[27]=findViewById(R.id.etxtCourse28);
        names[28]=findViewById(R.id.etxtCourse29);
        names[29]=findViewById(R.id.etxtCourse30);
        names[30]=findViewById(R.id.etxtCourse31);
        names[31]=findViewById(R.id.etxtCourse32);
        names[32]=findViewById(R.id.etxtCourse33);
        names[33]=findViewById(R.id.etxtCourse34);
        names[34]=findViewById(R.id.etxtCourse35);
        names[35]=findViewById(R.id.etxtCourse36);
        names[36]=findViewById(R.id.etxtCourse37);
        names[37]=findViewById(R.id.etxtCourse38);
        names[38]=findViewById(R.id.etxtCourse39);
        names[39]=findViewById(R.id.etxtCourse40);


        grade[0]=findViewById(R.id.etxtGrade1G);
        grade[1]=findViewById(R.id.etxtGrade2G);
        grade[2]=findViewById(R.id.etxtGrade3G);
        grade[3]=findViewById(R.id.etxtGrade4G);
        grade[4]=findViewById(R.id.etxtGrade5G);
        grade[5]=findViewById(R.id.etxtGrade6G);
        grade[6]=findViewById(R.id.etxtGrade7G);
        grade[7]=findViewById(R.id.etxtGrade8G);
        grade[8]=findViewById(R.id.etxtGrade9G);
        grade[9]=findViewById(R.id.etxtGrade10G);
        grade[10]=findViewById(R.id.etxtGrade11G);
        grade[11]=findViewById(R.id.etxtGrade12G);
        grade[12]=findViewById(R.id.etxtGrade13G);
        grade[13]=findViewById(R.id.etxtGrade14G);
        grade[14]=findViewById(R.id.etxtGrade15G);
        grade[15]=findViewById(R.id.etxtGrade16G);
        grade[16]=findViewById(R.id.etxtGrade17G);
        grade[17]=findViewById(R.id.etxtGrade18G);
        grade[18]=findViewById(R.id.etxtGrade19G);
        grade[19]=findViewById(R.id.etxtGrade20G);
        grade[20]=findViewById(R.id.etxtGrade21G);
        grade[21]=findViewById(R.id.etxtGrade22G);
        grade[22]=findViewById(R.id.etxtGrade23G);
        grade[23]=findViewById(R.id.etxtGrade24G);
        grade[24]=findViewById(R.id.etxtGrade25G);
        grade[25]=findViewById(R.id.etxtGrade26G);
        grade[26]=findViewById(R.id.etxtGrade27G);
        grade[27]=findViewById(R.id.etxtGrade28G);
        grade[28]=findViewById(R.id.etxtGrade29G);
        grade[29]=findViewById(R.id.etxtGrade30G);
        grade[30]=findViewById(R.id.etxtGrade31G);
        grade[31]=findViewById(R.id.etxtGrade32G);
        grade[32]=findViewById(R.id.etxtGrade33G);
        grade[33]=findViewById(R.id.etxtGrade34G);
        grade[34]=findViewById(R.id.etxtGrade35G);
        grade[35]=findViewById(R.id.etxtGrade36G);
        grade[36]=findViewById(R.id.etxtGrade37G);
        grade[37]=findViewById(R.id.etxtGrade38G);
        grade[38]=findViewById(R.id.etxtGrade39G);
        grade[39]=findViewById(R.id.etxtGrade40G);

        weight[0]=findViewById(R.id.etxtCredit1);
        weight[1]=findViewById(R.id.etxtCredit2);
        weight[2]=findViewById(R.id.etxtCredit3);
        weight[3]=findViewById(R.id.etxtCredit4);
        weight[4]=findViewById(R.id.etxtCredit5);
        weight[5]=findViewById(R.id.etxtCredit6);
        weight[6]=findViewById(R.id.etxtCredit7);
        weight[7]=findViewById(R.id.etxtCredit8);
        weight[8]=findViewById(R.id.etxtCredit9);
        weight[9]=findViewById(R.id.etxtCredit10);
        weight[10]=findViewById(R.id.etxtCredit11);
        weight[11]=findViewById(R.id.etxtCredit12);
        weight[12]=findViewById(R.id.etxtCredit13);
        weight[13]=findViewById(R.id.etxtCredit14);
        weight[14]=findViewById(R.id.etxtCredit15);
        weight[15]=findViewById(R.id.etxtCredit16);
        weight[16]=findViewById(R.id.etxtCredit17);
        weight[17]=findViewById(R.id.etxtCredit18);
        weight[18]=findViewById(R.id.etxtCredit19);
        weight[19]=findViewById(R.id.etxtCredit20);
        weight[20]=findViewById(R.id.etxtCredit21);
        weight[21]=findViewById(R.id.etxtCredit22);
        weight[22]=findViewById(R.id.etxtCredit23);
        weight[23]=findViewById(R.id.etxtCredit24);
        weight[24]=findViewById(R.id.etxtCredit25);
        weight[25]=findViewById(R.id.etxtCredit26);
        weight[26]=findViewById(R.id.etxtCredit27);
        weight[27]=findViewById(R.id.etxtCredit28);
        weight[28]=findViewById(R.id.etxtCredit29);
        weight[29]=findViewById(R.id.etxtCredit30);
        weight[30]=findViewById(R.id.etxtCredit31);
        weight[31]=findViewById(R.id.etxtCredit32);
        weight[32]=findViewById(R.id.etxtCredit33);
        weight[33]=findViewById(R.id.etxtCredit34);
        weight[34]=findViewById(R.id.etxtCredit35);
        weight[35]=findViewById(R.id.etxtCredit36);
        weight[36]=findViewById(R.id.etxtCredit37);
        weight[37]=findViewById(R.id.etxtCredit38);
        weight[38]=findViewById(R.id.etxtCredit39);
        weight[39]=findViewById(R.id.etxtCredit40);


        btnGoToGradeCalculator[0]=findViewById(R.id.btnCalculator1);
        btnGoToGradeCalculator[1]=findViewById(R.id.btnCalculator2);
        btnGoToGradeCalculator[2]=findViewById(R.id.btnCalculator3);
        btnGoToGradeCalculator[3]=findViewById(R.id.btnCalculator4);
        btnGoToGradeCalculator[4]=findViewById(R.id.btnCalculator5);
        btnGoToGradeCalculator[5]=findViewById(R.id.btnCalculator6);
        btnGoToGradeCalculator[6]=findViewById(R.id.btnCalculator7);
        btnGoToGradeCalculator[7]=findViewById(R.id.btnCalculator8);
        btnGoToGradeCalculator[8]=findViewById(R.id.btnCalculator9);
        btnGoToGradeCalculator[9]=findViewById(R.id.btnCalculator10);
        btnGoToGradeCalculator[10]=findViewById(R.id.btnCalculator11);
        btnGoToGradeCalculator[11]=findViewById(R.id.btnCalculator12);
        btnGoToGradeCalculator[12]=findViewById(R.id.btnCalculator13);
        btnGoToGradeCalculator[13]=findViewById(R.id.btnCalculator14);
        btnGoToGradeCalculator[14]=findViewById(R.id.btnCalculator15);
        btnGoToGradeCalculator[15]=findViewById(R.id.btnCalculator16);
        btnGoToGradeCalculator[16]=findViewById(R.id.btnCalculator17);
        btnGoToGradeCalculator[17]=findViewById(R.id.btnCalculator18);
        btnGoToGradeCalculator[18]=findViewById(R.id.btnCalculator19);
        btnGoToGradeCalculator[19]=findViewById(R.id.btnCalculator20);
        btnGoToGradeCalculator[20]=findViewById(R.id.btnCalculator21);
        btnGoToGradeCalculator[21]=findViewById(R.id.btnCalculator22);
        btnGoToGradeCalculator[22]=findViewById(R.id.btnCalculator23);
        btnGoToGradeCalculator[23]=findViewById(R.id.btnCalculator24);
        btnGoToGradeCalculator[24]=findViewById(R.id.btnCalculator25);
        btnGoToGradeCalculator[25]=findViewById(R.id.btnCalculator26);
        btnGoToGradeCalculator[26]=findViewById(R.id.btnCalculator27);
        btnGoToGradeCalculator[27]=findViewById(R.id.btnCalculator28);
        btnGoToGradeCalculator[28]=findViewById(R.id.btnCalculator29);
        btnGoToGradeCalculator[29]=findViewById(R.id.btnCalculator30);
        btnGoToGradeCalculator[30]=findViewById(R.id.btnCalculator31);
        btnGoToGradeCalculator[31]=findViewById(R.id.btnCalculator32);
        btnGoToGradeCalculator[32]=findViewById(R.id.btnCalculator33);
        btnGoToGradeCalculator[33]=findViewById(R.id.btnCalculator34);
        btnGoToGradeCalculator[34]=findViewById(R.id.btnCalculator35);
        btnGoToGradeCalculator[35]=findViewById(R.id.btnCalculator36);
        btnGoToGradeCalculator[36]=findViewById(R.id.btnCalculator37);
        btnGoToGradeCalculator[37]=findViewById(R.id.btnCalculator38);
        btnGoToGradeCalculator[38]=findViewById(R.id.btnCalculator39);
        btnGoToGradeCalculator[39]=findViewById(R.id.btnCalculator40);


        addBTNs[0]=findViewById(R.id.btnAdd1);
        addBTNs[1]=findViewById(R.id.btnAdd2);
        addBTNs[2]=findViewById(R.id.btnAdd3);
        addBTNs[3]=findViewById(R.id.btnAdd4);
        addBTNs[4]=findViewById(R.id.btnAdd5);
        addBTNs[5]=findViewById(R.id.btnAdd6);
        addBTNs[6]=findViewById(R.id.btnAdd7);
        addBTNs[7]=findViewById(R.id.btnAdd8);
        addBTNs[8]=findViewById(R.id.btnAdd9);
        addBTNs[9]=findViewById(R.id.btnAdd10);
        addBTNs[10]=findViewById(R.id.btnAdd11);
        addBTNs[11]=findViewById(R.id.btnAdd12);
        addBTNs[12]=findViewById(R.id.btnAdd13);
        addBTNs[13]=findViewById(R.id.btnAdd14);
        addBTNs[14]=findViewById(R.id.btnAdd15);
        addBTNs[15]=findViewById(R.id.btnAdd16);
        addBTNs[16]=findViewById(R.id.btnAdd17);
        addBTNs[17]=findViewById(R.id.btnAdd18);
        addBTNs[18]=findViewById(R.id.btnAdd19);
        addBTNs[19]=findViewById(R.id.btnAdd20);
        addBTNs[20]=findViewById(R.id.btnAdd21);
        addBTNs[21]=findViewById(R.id.btnAdd22);
        addBTNs[22]=findViewById(R.id.btnAdd23);
        addBTNs[23]=findViewById(R.id.btnAdd24);
        addBTNs[24]=findViewById(R.id.btnAdd25);
        addBTNs[25]=findViewById(R.id.btnAdd26);
        addBTNs[26]=findViewById(R.id.btnAdd27);
        addBTNs[27]=findViewById(R.id.btnAdd28);
        addBTNs[28]=findViewById(R.id.btnAdd29);
        addBTNs[29]=findViewById(R.id.btnAdd30);
        addBTNs[30]=findViewById(R.id.btnAdd31);
        addBTNs[31]=findViewById(R.id.btnAdd32);
        addBTNs[32]=findViewById(R.id.btnAdd33);
        addBTNs[33]=findViewById(R.id.btnAdd34);
        addBTNs[34]=findViewById(R.id.btnAdd35);
        addBTNs[35]=findViewById(R.id.btnAdd36);
        addBTNs[36]=findViewById(R.id.btnAdd37);
        addBTNs[37]=findViewById(R.id.btnAdd38);
        addBTNs[38]=findViewById(R.id.btnAdd39);



        for (int x=1; x<names.length; x++){
            names[x].setVisibility(View.INVISIBLE);
            grade[x].setVisibility(View.INVISIBLE);
            weight[x].setVisibility(View.INVISIBLE);
            btnGoToGradeCalculator[x].setVisibility(View.INVISIBLE);
            if (x<addBTNs.length) addBTNs[x].hide();
        }


        this.provinceSpinner = findViewById(R.id.spProvince);
        final ArrayAdapter<String> provinceAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.provinces));
        provinceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        provinceSpinner.setAdapter(provinceAdapter);

        provinceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner schoolSpinner = findViewById(R.id.spSchool);
                if (provinceAdapter.getItem(position).equals("Alberta")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.AlbertaSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("British Columbia")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BritishColumbiaSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("Manitoba")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ManitobaSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("New Brunswick")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NewBrunswickSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("Newfoundland and Labrador")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NewfoundlandAndLabSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("Nova Scotia")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NovaScotiaSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("Ontario")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.OntarioSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("Prince Edward Island")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.PEISchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("Quebec")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.QuebecSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
                if (provinceAdapter.getItem(position).equals("Saskatchewan")) {
                    ArrayAdapter<String> schoolAdapter = new ArrayAdapter<String>(GPActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SaskatchewanSchools));
                    schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    schoolSpinner.setAdapter(schoolAdapter);
                }
            }
            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }

    public void CalculateOnClick (View view){
        GPACalculator gpacalculator= new GPACalculator();
        GradeCalculator gradeCalculator= new GradeCalculator();
        TextView gpa = findViewById(R.id.gpa);
        TextView average = findViewById(R.id.average);
        Spinner schoolSpinner= findViewById(R.id.spSchool);
        String school= schoolSpinner.getSelectedItem().toString();
        Grades grades= new Grades();
        AlertDialog.Builder alert=new AlertDialog.Builder(GPActivity.this);
        alert.setCancelable(true);
        boolean incomplete=false;

        if (this.current>0) {
            EditText credit1 = findViewById(R.id.etxtCredit1);
            EditText grade1 = findViewById(R.id.etxtGrade1G);
            if (grade1.getText().toString().isEmpty() || credit1.getText().toString().isEmpty()){
                alert.setTitle("Your 1st Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 1st course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade1.getText().toString()), 2.0 * Double.parseDouble(credit1.getText().toString())));
        }
        if (this.current>1&& !incomplete) {
            EditText credit2 = findViewById(R.id.etxtCredit2);
            EditText grade2 = findViewById(R.id.etxtGrade2G);
            if (grade2.getText().toString().isEmpty() || credit2.getText().toString().isEmpty()){
                alert.setTitle("Your 2nd Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 2nd course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade2.getText().toString()), 2.0 * Double.parseDouble(credit2.getText().toString())));
        }
        if (this.current>2&& !incomplete) {
            EditText credit3 = findViewById(R.id.etxtCredit3);
            EditText grade3 = findViewById(R.id.etxtGrade3G);
            if (grade3.getText().toString().isEmpty() || credit3.getText().toString().isEmpty()){
                alert.setTitle("Your 3th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 3rd course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade3.getText().toString()), 2.0 * Double.parseDouble(credit3.getText().toString())));
        }
        if (this.current>3&& !incomplete) {
            EditText credit4 = findViewById(R.id.etxtCredit4);
            EditText grade4 = findViewById(R.id.etxtGrade4G);
            if (grade4.getText().toString().isEmpty() || credit4.getText().toString().isEmpty()){
                alert.setTitle("Your 4th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 4th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade4.getText().toString()), 2.0 * Double.parseDouble(credit4.getText().toString())));
        }
        if (this.current>4&& !incomplete) {
            EditText credit5 = findViewById(R.id.etxtCredit5);
            EditText grade5 = findViewById(R.id.etxtGrade5G);
            if (grade5.getText().toString().isEmpty() || credit5.getText().toString().isEmpty()){
                alert.setTitle("Your 5th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 5th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade5.getText().toString()), 2.0 * Double.parseDouble(credit5.getText().toString())));
        }
        if (this.current>5&& !incomplete) {
            EditText credit6 = findViewById(R.id.etxtCredit6);
            EditText grade6 = findViewById(R.id.etxtGrade6G);
            if (grade6.getText().toString().isEmpty() || credit6.getText().toString().isEmpty()){
                alert.setTitle("Your 6th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 6th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade6.getText().toString()), 2.0 * Double.parseDouble(credit6.getText().toString())));
        }
        if (this.current>6&& !incomplete) {
            EditText credit7 = findViewById(R.id.etxtCredit7);
            EditText grade7 = findViewById(R.id.etxtGrade7G);
            if (grade7.getText().toString().isEmpty() || credit7.getText().toString().isEmpty()){
                alert.setTitle("Your 7th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 7th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade7.getText().toString()), 2.0 * Double.parseDouble(credit7.getText().toString())));
        }
        if (this.current>7&& !incomplete) {
            EditText credit8 = findViewById(R.id.etxtCredit8);
            EditText grade8 = findViewById(R.id.etxtGrade8G);
            if (grade8.getText().toString().isEmpty() || credit8.getText().toString().isEmpty()){
                alert.setTitle("YYour 8th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 8th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade8.getText().toString()), 2.0 * Double.parseDouble(credit8.getText().toString())));
        }
        if (this.current>8&& !incomplete) {
            EditText credit9 = findViewById(R.id.etxtCredit9);
            EditText grade9 = findViewById(R.id.etxtGrade9G);
            if (grade9.getText().toString().isEmpty() || credit9.getText().toString().isEmpty()){
                alert.setTitle("Your 9th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 9th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade9.getText().toString()), 2.0 * Double.parseDouble(credit9.getText().toString())));
        }
        if (this.current>9 && !incomplete) {
            EditText credit10 = findViewById(R.id.etxtCredit10);
            EditText grade10 = findViewById(R.id.etxtGrade10G);
            if (grade10.getText().toString().isEmpty() || credit10.getText().toString().isEmpty()){
                alert.setTitle("Your 10th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 10th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade10.getText().toString()), 2.0 * Double.parseDouble(credit10.getText().toString())));
        }
        if (this.current>10 && !incomplete) {
            EditText credit11 = findViewById(R.id.etxtCredit11);
            EditText grade11 = findViewById(R.id.etxtGrade11G);
            if (grade11.getText().toString().isEmpty() || credit11.getText().toString().isEmpty()){
                alert.setTitle("Your 11th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 11th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade11.getText().toString()), 2.0 * Double.parseDouble(credit11.getText().toString())));
        }
        if (this.current>11 && !incomplete) {
            EditText credit12 = findViewById(R.id.etxtCredit12);
            EditText grade12 = findViewById(R.id.etxtGrade12G);
            if (grade12.getText().toString().isEmpty() || credit12.getText().toString().isEmpty()){
                alert.setTitle("Your 12th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 12th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade12.getText().toString()), 2.0 * Double.parseDouble(credit12.getText().toString())));
        }
        if (this.current>13 && !incomplete) {
            EditText credit13 = findViewById(R.id.etxtCredit13);
            EditText grade13 = findViewById(R.id.etxtGrade13G);
            if (grade13.getText().toString().isEmpty() || credit13.getText().toString().isEmpty()){
                alert.setTitle("Your 13th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 13th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade13.getText().toString()), 2.0 * Double.parseDouble(credit13.getText().toString())));
        }
        if (this.current>13 && !incomplete) {
            EditText credit14 = findViewById(R.id.etxtCredit14);
            EditText grade14 = findViewById(R.id.etxtGrade14G);
            if (grade14.getText().toString().isEmpty() || credit14.getText().toString().isEmpty()){
                alert.setTitle("Your 14th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 14th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade14.getText().toString()), 2.0 * Double.parseDouble(credit14.getText().toString())));
        }
        if (this.current>14 && !incomplete) {
            EditText credit15 = findViewById(R.id.etxtCredit15);
            EditText grade15 = findViewById(R.id.etxtGrade15G);
            if (grade15.getText().toString().isEmpty() || credit15.getText().toString().isEmpty()){
                alert.setTitle("Your 15th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 15th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade15.getText().toString()), 2.0 * Double.parseDouble(credit15.getText().toString())));
        }
        if (this.current>15 && !incomplete) {
            EditText credit16 = findViewById(R.id.etxtCredit16);
            EditText grade16 = findViewById(R.id.etxtGrade16G);
            if (grade16.getText().toString().isEmpty() || credit16.getText().toString().isEmpty()){
                alert.setTitle("Your 16th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 16th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade16.getText().toString()), 2.0 * Double.parseDouble(credit16.getText().toString())));
        }
        if (this.current>16 && !incomplete) {
            EditText credit17 = findViewById(R.id.etxtCredit17);
            EditText grade17 = findViewById(R.id.etxtGrade17G);
            if (grade17.getText().toString().isEmpty() || credit17.getText().toString().isEmpty()){
                alert.setTitle("Your 17th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 17th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade17.getText().toString()), 2.0 * Double.parseDouble(credit17.getText().toString())));
        }
        if (this.current>17 && !incomplete) {
            EditText credit18 = findViewById(R.id.etxtCredit18);
            EditText grade18 = findViewById(R.id.etxtGrade18G);
            if (grade18.getText().toString().isEmpty() || credit18.getText().toString().isEmpty()){
                alert.setTitle("Your 18th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 18th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade18.getText().toString()), 2.0 * Double.parseDouble(credit18.getText().toString())));
        }
        if (this.current>18 && !incomplete) {
            EditText credit19 = findViewById(R.id.etxtCredit19);
            EditText grade19 = findViewById(R.id.etxtGrade19G);
            if (grade19.getText().toString().isEmpty() || credit19.getText().toString().isEmpty()){
                alert.setTitle("Your 19th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 19th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade19.getText().toString()), 2.0 * Double.parseDouble(credit19.getText().toString())));
        }
        if (this.current>19 && !incomplete) {
            EditText credit20 = findViewById(R.id.etxtCredit20);
            EditText grade20 = findViewById(R.id.etxtGrade20G);
            if (grade20.getText().toString().isEmpty() || credit20.getText().toString().isEmpty()){
                alert.setTitle("Your 20th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 20th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade20.getText().toString()), 2.0 * Double.parseDouble(credit20.getText().toString())));
        }
        if (this.current>20 && !incomplete) {
            EditText credit21 = findViewById(R.id.etxtCredit21);
            EditText grade21 = findViewById(R.id.etxtGrade21G);
            if (grade21.getText().toString().isEmpty() || credit21.getText().toString().isEmpty()){
                alert.setTitle("Your 21st Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 21st course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade21.getText().toString()), 2.0 * Double.parseDouble(credit21.getText().toString())));
        }
        if (this.current>21 && !incomplete) {
            EditText credit22 = findViewById(R.id.etxtCredit22);
            EditText grade22 = findViewById(R.id.etxtGrade22G);
            if (grade22.getText().toString().isEmpty() || credit22.getText().toString().isEmpty()){
                alert.setTitle("Your 22nd Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 22nd course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade22.getText().toString()), 2.0 * Double.parseDouble(credit22.getText().toString())));
        }
        if (this.current>22 && !incomplete) {
            EditText credit23 = findViewById(R.id.etxtCredit23);
            EditText grade23= findViewById(R.id.etxtGrade23G);
            if (grade23.getText().toString().isEmpty() || credit23.getText().toString().isEmpty()){
                alert.setTitle("Your 23rd Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 23rd course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade23.getText().toString()), 2.0 * Double.parseDouble(credit23.getText().toString())));
        }
        if (this.current>23 && !incomplete) {
            EditText credit24 = findViewById(R.id.etxtCredit24);
            EditText grade24 = findViewById(R.id.etxtGrade24G);
            if (grade24.getText().toString().isEmpty() || credit24.getText().toString().isEmpty()){
                alert.setTitle("Your 24th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 24th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade24.getText().toString()), 2.0 * Double.parseDouble(credit24.getText().toString())));
        }
        if (this.current>24 && !incomplete) {
            EditText credit25 = findViewById(R.id.etxtCredit25);
            EditText grade25 = findViewById(R.id.etxtGrade25G);
            if (grade25.getText().toString().isEmpty() || credit25.getText().toString().isEmpty()){
                alert.setTitle("Your 25th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 25th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade25.getText().toString()), 2.0 * Double.parseDouble(credit25.getText().toString())));
        }
        if (this.current>25 && !incomplete) {
            EditText credit26 = findViewById(R.id.etxtCredit26);
            EditText grade26 = findViewById(R.id.etxtGrade26G);
            if (grade26.getText().toString().isEmpty() || credit26.getText().toString().isEmpty()){
                alert.setTitle("Your 26th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 26th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade26.getText().toString()), 2.0 * Double.parseDouble(credit26.getText().toString())));
        }
        if (this.current>26 && !incomplete) {
            EditText credit27 = findViewById(R.id.etxtCredit27);
            EditText grade27 = findViewById(R.id.etxtGrade27G);
            if (grade27.getText().toString().isEmpty() || credit27.getText().toString().isEmpty()){
                alert.setTitle("Your 27th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 27th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade27.getText().toString()), 2.0 * Double.parseDouble(credit27.getText().toString())));
        }
        if (this.current>27 && !incomplete) {
            EditText credit28 = findViewById(R.id.etxtCredit28);
            EditText grade28 = findViewById(R.id.etxtGrade28G);
            if (grade28.getText().toString().isEmpty() || credit28.getText().toString().isEmpty()){
                alert.setTitle("Your 28th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 28th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade28.getText().toString()), 2.0 * Double.parseDouble(credit28.getText().toString())));
        }if (this.current>28 && !incomplete) {
            EditText credit29 = findViewById(R.id.etxtCredit29);
            EditText grade29 = findViewById(R.id.etxtGrade29G);
            if (grade29.getText().toString().isEmpty() || credit29.getText().toString().isEmpty()){
                alert.setTitle("Your 29th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 29th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade29.getText().toString()), 2.0 * Double.parseDouble(credit29.getText().toString())));
        }if (this.current>29 && !incomplete) {
            EditText credit30 = findViewById(R.id.etxtCredit30);
            EditText grade30 = findViewById(R.id.etxtGrade30G);
            if (grade30.getText().toString().isEmpty() || credit30.getText().toString().isEmpty()){
                alert.setTitle("Your 30th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 30th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade30.getText().toString()), 2.0 * Double.parseDouble(credit30.getText().toString())));
        }if (this.current>30 && !incomplete) {
            EditText credit31 = findViewById(R.id.etxtCredit31);
            EditText grade31 = findViewById(R.id.etxtGrade31G);
            if (grade31.getText().toString().isEmpty() || credit31.getText().toString().isEmpty()){
                alert.setTitle("Your 31st Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 31st course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade31.getText().toString()), 2.0 * Double.parseDouble(credit31.getText().toString())));
        }if (this.current>31 && !incomplete) {
            EditText credit32 = findViewById(R.id.etxtCredit32);
            EditText grade32 = findViewById(R.id.etxtGrade32G);
            if (grade32.getText().toString().isEmpty() || credit32.getText().toString().isEmpty()){
                alert.setTitle("Your 32nd Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 32nd course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade32.getText().toString()), 2.0 * Double.parseDouble(credit32.getText().toString())));
        }if (this.current>32 && !incomplete) {
            EditText credit33 = findViewById(R.id.etxtCredit33);
            EditText grade33 = findViewById(R.id.etxtGrade33G);
            if (grade33.getText().toString().isEmpty() || credit33.getText().toString().isEmpty()){
                alert.setTitle("Your 33rd Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 33rd course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade33.getText().toString()), 2.0 * Double.parseDouble(credit33.getText().toString())));
        }
        if (this.current>33 && !incomplete) {
            EditText credit34 = findViewById(R.id.etxtCredit34);
            EditText grade34 = findViewById(R.id.etxtGrade34G);
            if (grade34.getText().toString().isEmpty() || credit34.getText().toString().isEmpty()){
                alert.setTitle("Your 34th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 34th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade34.getText().toString()), 2.0 * Double.parseDouble(credit34.getText().toString())));
        }if (this.current>34 && !incomplete) {
            EditText credit35 = findViewById(R.id.etxtCredit35);
            EditText grade35 = findViewById(R.id.etxtGrade35G);
            if (grade35.getText().toString().isEmpty() || credit35.getText().toString().isEmpty()){
                alert.setTitle("Your 35th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 35th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade35.getText().toString()), 2.0 * Double.parseDouble(credit35.getText().toString())));
        }
        if (this.current>35 && !incomplete) {
            EditText credit36 = findViewById(R.id.etxtCredit36);
            EditText grade36 = findViewById(R.id.etxtGrade36G);
            if (grade36.getText().toString().isEmpty() || credit36.getText().toString().isEmpty()){
                alert.setTitle("Your 36th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 36th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade36.getText().toString()), 2.0 * Double.parseDouble(credit36.getText().toString())));
        }if (this.current>36 && !incomplete) {
            EditText credit37 = findViewById(R.id.etxtCredit37);
            EditText grade37 = findViewById(R.id.etxtGrade37G);
            if (grade37.getText().toString().isEmpty() || credit37.getText().toString().isEmpty()){
                alert.setTitle("Your 37th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 37th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade37.getText().toString()), 2.0 * Double.parseDouble(credit37.getText().toString())));
        }if (this.current>37 && !incomplete) {
            EditText credit38 = findViewById(R.id.etxtCredit38);
            EditText grade38 = findViewById(R.id.etxtGrade38G);
            if (grade38.getText().toString().isEmpty() || credit38.getText().toString().isEmpty()){
                alert.setTitle("Your 38th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 38th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade38.getText().toString()), 2.0 * Double.parseDouble(credit38.getText().toString())));
        }
        if (this.current>38 && !incomplete) {
            EditText credit39 = findViewById(R.id.etxtCredit39);
            EditText grade39 = findViewById(R.id.etxtGrade39G);
            if (grade39.getText().toString().isEmpty() || credit39.getText().toString().isEmpty()){
                alert.setTitle("Your 39th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 39th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade39.getText().toString()), 2.0 * Double.parseDouble(credit39.getText().toString())));
        }
        if (this.current>39 && !incomplete) {
            EditText credit40 = findViewById(R.id.etxtCredit40);
            EditText grade40 = findViewById(R.id.etxtGrade40G);
            if (grade40.getText().toString().isEmpty() || credit40.getText().toString().isEmpty()){
                alert.setTitle("Your 40th Course Entry is Not Complete");
                alert.setMessage("Please complete both the credit and grade section for your 40th course");
                alert.setPositiveButton(Html.fromHtml("<font color='#D50000'>Okay</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                incomplete=true;
            }
            else grades.addGrade(new Grade(Double.parseDouble(grade40.getText().toString()), 2.0 * Double.parseDouble(credit40.getText().toString())));
        }

        if (!incomplete) {
            Double temp = gpacalculator.calculateGPA(grades, school);
            Double temp2 = gradeCalculator.calculatorWeightedAverage(grades);

            gpa.setText("Your GPA: " + temp.toString());
            average.setText("Your Weighted Average: " + temp2.toString());

            findViewById(R.id.btnCalculate).setVisibility(View.INVISIBLE);
            findViewById(R.id.btnEdit).setVisibility(View.VISIBLE);
            for (int x=0; x<names.length; x++){
                names[x].setEnabled(false);
                grade[x].setEnabled(false);
                weight[x].setEnabled(false);
                if (x<addBTNs.length) addBTNs[x].setEnabled(false);
            }
            findViewById(R.id.txtProvince).setVisibility(View.INVISIBLE);
            findViewById(R.id.txtSchool).setVisibility(View.INVISIBLE);
            findViewById(R.id.spSchool).setVisibility(View.INVISIBLE);
            findViewById(R.id.spProvince).setVisibility(View.INVISIBLE);
        }

    }

    public void addCourse(View view) {
        if (current<names.length) {
            names[current].setVisibility(View.VISIBLE);
            grade[current].setVisibility(View.VISIBLE);
            weight[current].setVisibility(View.VISIBLE);
            btnGoToGradeCalculator[current].setVisibility(View.VISIBLE);
            if (current<addBTNs.length) addBTNs[current].show();
            addBTNs[current - 1].hide();
            current++;
        }
    }

    public void RestartOnClick(View view){
        Intent restartIntent= new Intent(GPActivity.this, GPActivity.class);
        GPActivity.this.startActivity(restartIntent);
    }
    public void homeOnClick(View view){
        Intent mainIntent= new Intent(GPActivity.this, MainActivity.class);
        GPActivity.this.startActivity(mainIntent);
    }
    public void editOnClick(View view){
        findViewById(R.id.btnCalculate).setVisibility(View.VISIBLE);
        findViewById(R.id.btnEdit).setVisibility(View.INVISIBLE);
        ((TextView)findViewById(R.id.gpa)).setText("");
        ((TextView)findViewById(R.id.average)).setText("");
        for (int x=0; x<names.length; x++){
            names[x].setEnabled(true);
            grade[x].setEnabled(true);
            weight[x].setEnabled(true);
            if (x<addBTNs.length) addBTNs[x].setEnabled(true);
        }
        findViewById(R.id.txtProvince).setVisibility(View.VISIBLE);
        findViewById(R.id.txtSchool).setVisibility(View.VISIBLE);
        findViewById(R.id.spSchool).setVisibility(View.VISIBLE);
        findViewById(R.id.spProvince).setVisibility(View.VISIBLE);
    }
    public void onClickCalculator1 (View view){
        this.button=1;
        getGrade();
    }
    public void onClickCalculator2 (View view){
        this.button=2;
        getGrade();
    }
    public void onClickCalculator3 (View view){
        this.button=3;
        getGrade();
    }
    public void onClickCalculator4 (View view){
        this.button=4;
        getGrade();
    }
    public void onClickCalculator5 (View view){
        this.button=5;
        getGrade();
    }
    public void onClickCalculator6 (View view){
        this.button=6;
        getGrade();
    }
    public void onClickCalculator7 (View view){
        this.button=7;
        getGrade();
    }
    public void onClickCalculator8 (View view){
        this.button=8;
        getGrade();
    }
    public void onClickCalculator9 (View view){
        this.button=9;
        getGrade();
    }
    public void onClickCalculator10 (View view){
        this.button=10;
        getGrade();
    }
    public void onClickCalculator11 (View view){
        this.button=11;
        getGrade();
    }
    public void onClickCalculator12 (View view){
        this.button=12;
        getGrade();
    }
    public void onClickCalculator13 (View view){
        this.button=13;
        getGrade();
    }
    public void onClickCalculator14 (View view){
        this.button=14;
        getGrade();
    }
    public void onClickCalculator15 (View view){
        this.button=15;
        getGrade();
    }
    public void onClickCalculator16 (View view){
        this.button=16;
        getGrade();
    }
    public void onClickCalculator17 (View view){
        this.button=17;
        getGrade();
    }
    public void onClickCalculator18 (View view){
        this.button=18;
        getGrade();
    }
    public void onClickCalculator19 (View view){
        this.button=19;
        getGrade();
    }
    public void onClickCalculator20 (View view){
        this.button=20;
        getGrade();
    }
    public void onClickCalculator21 (View view){
        this.button=21;
        getGrade();
    }
    public void onClickCalculator22 (View view){
        this.button=22;
        getGrade();
    }
    public void onClickCalculator23 (View view){
        this.button=23;
        getGrade();
    }
    public void onClickCalculator24 (View view){
        this.button=24;
        getGrade();
    }
    public void onClickCalculator25 (View view){
        this.button=25;
        getGrade();
    }
    public void onClickCalculator26 (View view){
        this.button=26;
        getGrade();
    }
    public void onClickCalculator27 (View view){
        this.button=27;
        getGrade();
    }
    public void onClickCalculator28 (View view){
        this.button=28;
        getGrade();
    }public void onClickCalculator29 (View view){
        this.button=29;
        getGrade();
    }
    public void onClickCalculator30 (View view){
        this.button=30;
        getGrade();
    }
    public void onClickCalculator31 (View view){
        this.button=31;
        getGrade();
    }
    public void onClickCalculator32 (View view){
        this.button=32;
        getGrade();
    }
    public void onClickCalculator33 (View view){
        this.button=33;
        getGrade();
    }
    public void onClickCalculator34 (View view){
        this.button=34;
        getGrade();
    }
    public void onClickCalculator35 (View view){
        this.button=35;
        getGrade();
    }
    public void onClickCalculator36 (View view){
        this.button=36;
        getGrade();
    }
    public void onClickCalculator37 (View view){
        this.button=37;
        getGrade();
    }
    public void onClickCalculator38 (View view){
        this.button=38;
        getGrade();
    }
    public void onClickCalculator39 (View view){
        this.button=39;
        getGrade();
    }
    public void onClickCalculator40 (View view){
        this.button=40;
        getGrade();
    }

    private void getGrade(){
        fromGPA=true;
        Intent mainIntent= new Intent(GPActivity.this, GradeCalculatorActivity.class);
        startActivityForResult(mainIntent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                Double answer=data.getDoubleExtra("answer",0.0);
                if (this.button==1) ((EditText)findViewById(R.id.etxtGrade1G)).setText((answer.toString()));
                else if (this.button==2)((EditText)findViewById(R.id.etxtGrade2G)).setText((answer.toString()));
                else if (this.button==3)((EditText)findViewById(R.id.etxtGrade3G)).setText((answer.toString()));
                else if (this.button==4)((EditText)findViewById(R.id.etxtGrade4G)).setText((answer.toString()));
                else if (this.button==5)((EditText)findViewById(R.id.etxtGrade5G)).setText((answer.toString()));
                else if (this.button==6)((EditText)findViewById(R.id.etxtGrade6G)).setText((answer.toString()));
                else if (this.button==7)((EditText)findViewById(R.id.etxtGrade7G)).setText((answer.toString()));
                else if (this.button==8)((EditText)findViewById(R.id.etxtGrade8G)).setText((answer.toString()));
                else if (this.button==9)((EditText)findViewById(R.id.etxtGrade9G)).setText((answer.toString()));
                else if (this.button==10)((EditText)findViewById(R.id.etxtGrade10G)).setText((answer.toString()));
                else if (this.button==11)((EditText)findViewById(R.id.etxtGrade11G)).setText((answer.toString()));
                else if (this.button==12)((EditText)findViewById(R.id.etxtGrade12G)).setText((answer.toString()));
                else if (this.button==13)((EditText)findViewById(R.id.etxtGrade13G)).setText((answer.toString()));
                else if (this.button==14)((EditText)findViewById(R.id.etxtGrade14G)).setText((answer.toString()));
                else if (this.button==15)((EditText)findViewById(R.id.etxtGrade15G)).setText((answer.toString()));
                else if (this.button==16)((EditText)findViewById(R.id.etxtGrade16G)).setText((answer.toString()));
                else if (this.button==17)((EditText)findViewById(R.id.etxtGrade17G)).setText((answer.toString()));
                else if (this.button==18)((EditText)findViewById(R.id.etxtGrade18G)).setText((answer.toString()));
                else if (this.button==19)((EditText)findViewById(R.id.etxtGrade19G)).setText((answer.toString()));
                else if (this.button==20)((EditText)findViewById(R.id.etxtGrade20G)).setText((answer.toString()));
                else if (this.button==21)((EditText)findViewById(R.id.etxtGrade21G)).setText((answer.toString()));
                else if (this.button==22)((EditText)findViewById(R.id.etxtGrade22G)).setText((answer.toString()));
                else if (this.button==23)((EditText)findViewById(R.id.etxtGrade23G)).setText((answer.toString()));
                else if (this.button==24)((EditText)findViewById(R.id.etxtGrade24G)).setText((answer.toString()));
                else if (this.button==25)((EditText)findViewById(R.id.etxtGrade25G)).setText((answer.toString()));
                else if (this.button==26)((EditText)findViewById(R.id.etxtGrade26G)).setText((answer.toString()));
                else if (this.button==27)((EditText)findViewById(R.id.etxtGrade27G)).setText((answer.toString()));
                else if (this.button==28)((EditText)findViewById(R.id.etxtGrade28G)).setText((answer.toString()));
                else if (this.button==29)((EditText)findViewById(R.id.etxtGrade29G)).setText((answer.toString()));
                else if (this.button==30)((EditText)findViewById(R.id.etxtGrade30G)).setText((answer.toString()));
                else if (this.button==31)((EditText)findViewById(R.id.etxtGrade31G)).setText((answer.toString()));
                else if (this.button==32)((EditText)findViewById(R.id.etxtGrade32G)).setText((answer.toString()));
                else if (this.button==33)((EditText)findViewById(R.id.etxtGrade33G)).setText((answer.toString()));
                else if (this.button==34)((EditText)findViewById(R.id.etxtGrade34G)).setText((answer.toString()));
                else if (this.button==35)((EditText)findViewById(R.id.etxtGrade35G)).setText((answer.toString()));
                else if (this.button==36)((EditText)findViewById(R.id.etxtGrade36G)).setText((answer.toString()));
                else if (this.button==37)((EditText)findViewById(R.id.etxtGrade37G)).setText((answer.toString()));
                else if (this.button==38)((EditText)findViewById(R.id.etxtGrade38G)).setText((answer.toString()));
                else if (this.button==39)((EditText)findViewById(R.id.etxtGrade39G)).setText((answer.toString()));
                else if (this.button==40)((EditText)findViewById(R.id.etxtGrade40G)).setText((answer.toString()));

            }
            if (resultCode == Activity.RESULT_CANCELED) {
            }
        }
    }//onActivityResult
}