package com.example.resumeapplication;

import static com.example.resumeapplication.R.color.purple_500;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class resumeActivity2 extends AppCompatActivity {

    TextView txtEnglish,Contunue;
    int co;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume2);

        initview();
    }

    @SuppressLint("ResourceAsColor")
    private void initview() {
        txtEnglish=findViewById(R.id.txtEnglish);
        Contunue=findViewById(R.id.Contunue);

        txtEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtEnglish.setBackgroundColor(purple_500);
                co=1;

            }
        });
        Contunue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(co==1)
                {
                    Intent i=new Intent(resumeActivity2.this,resumeActivity3.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(resumeActivity2.this,"Pleace select language", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}