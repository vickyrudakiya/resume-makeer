package com.example.resumeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class resume4Activity extends AppCompatActivity {

    String name,email,number,addresh,dob,state,school,year,skill,coname,job,edu;
    TextView txtName,txtEmail,txtNumber,txtAddresh,txtDOB,txtschool,txtYear,txtSkill,txtCname,txtJob,txtEducation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume4);


        initview();


        if (getIntent() != null) {
            name = getIntent().getStringExtra("fname");
            email=getIntent().getStringExtra("Email");
            number=getIntent().getStringExtra("Number");
            addresh=getIntent().getStringExtra("Addresh");
            dob=getIntent().getStringExtra("birthday");
            school=getIntent().getStringExtra("School");
            year=getIntent().getStringExtra("Year");
            skill=getIntent().getStringExtra("Skill");
            coname=getIntent().getStringExtra("cname");
            job=getIntent().getStringExtra("Job");
            edu=getIntent().getStringExtra("Edu");

            txtName.setText(name);
            txtEmail.setText(email);
            txtNumber.setText(number);
            txtAddresh.setText(addresh);
            txtDOB.setText(dob);
            txtschool.setText(school);
            txtYear.setText(year);
            txtSkill.setText(skill);
            txtCname.setText(coname);
            txtEducation.setText(edu);
        }
    }

    private void initview() {
        txtName = findViewById(R.id.txtName);
        txtEmail=findViewById(R.id.txtEmail);
        txtNumber=findViewById(R.id.txtNumber);
        txtAddresh=findViewById(R.id.txtAddresh);
        txtDOB=findViewById(R.id.txtDOB);
        txtschool=findViewById(R.id.txtschool);
        txtYear=findViewById(R.id.txtYear);
        txtSkill=findViewById(R.id.txtSkill);
        txtCname=findViewById(R.id.txtCname);
        txtEducation=findViewById(R.id.txtEducation);
    }
}