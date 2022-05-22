package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ques4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques4);


        Button ABtn=findViewById(R.id.correct4);
        Button VButton=findViewById(R.id.v1);
        Button MButton=findViewById(R.id.m1);
        Button EButton=findViewById(R.id.e1);

        //alert dialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setMessage("Wrong Answer! Please try again!");



        ABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ques4.this,ques5.class);
                startActivity(intent);
            }
        });

        //wrong answers
        VButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        MButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        EButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });
    }
}