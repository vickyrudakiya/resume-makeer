package com.example.resumeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class resumeActivity3 extends AppCompatActivity {
    TextView texResent,texSave;
    EditText edtFname,edtEmail,edtMnumber,edtAddress,edtDbirthday,edtSchool,edtYear,edtskill,edtcompany,edtjEducation;
    Spinner spinner;
    String item1;

//    RadioButton RbtnMale;
//    com.google.android.material.textfield.TextInputLayout edtFname;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume3);

        intview();
    }

    private void intview() {

        texResent=findViewById(R.id.texResent);
        edtFname=findViewById(R.id.edtFname);
        edtEmail=findViewById(R.id.edtEmail);
        edtMnumber=findViewById(R.id.edtMnumber);
        edtAddress=findViewById(R.id.edtAddress);
        edtDbirthday=findViewById(R.id.edtDbirthday);
        texSave=findViewById(R.id.texSave);
        spinner=findViewById(R.id.spinner);
        edtSchool=findViewById(R.id.edtSchool);
        edtYear=findViewById(R.id.edtYear);
        edtskill=findViewById(R.id.edtskill);
        edtcompany=findViewById(R.id.edtcompany);
        edtjEducation=findViewById(R.id.edtjEducation);



//        RbtnMale=findViewById(R.id.RbtnMale);


        texResent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtFname.setText(null);
                edtEmail.setText(null);
                edtMnumber.setText(null);
                edtAddress.setText(null);
                edtDbirthday.setText(null);
                edtSchool.setText(null);
                edtYear.setText(null);
                edtskill.setText(null);
                edtcompany.setText(null);
                edtjEducation.setText(null);


            }
        });
        texSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname=edtFname.getText().toString();
                String Email=edtEmail.getText().toString();
                String Number=edtMnumber.getText().toString();
                String Addresh=edtAddress.getText().toString();
                String birthday=edtDbirthday.getText().toString();
                String School=edtSchool.getText().toString();
                String year=edtYear.getText().toString();
                String skill=edtskill.getText().toString();
                String Cname=edtcompany.getText().toString();
                String edu=edtjEducation.getText().toString();



                Intent i = new Intent(resumeActivity3.this,resume4Activity.class);
                i.putExtra("fname", fname);
                i.putExtra("Email",Email);
                i.putExtra("Number",Number);
                i.putExtra("Addresh",Addresh);
                i.putExtra("birthday",birthday);
                i.putExtra("item",item1);
                i.putExtra("School",School);
                i.putExtra("Year",year);
                i.putExtra("Skill",skill);
                i.putExtra("cname",Cname);
                i.putExtra("Edu",edu);
                startActivity(i);
            }
        });

        List<String> footballPlayers = new ArrayList<>();


        footballPlayers.add(0, "Marital state");
        footballPlayers.add("Single");
        footballPlayers.add("Unmarried");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, footballPlayers);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose timing duraion")){


                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    item1=item;
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }
}
