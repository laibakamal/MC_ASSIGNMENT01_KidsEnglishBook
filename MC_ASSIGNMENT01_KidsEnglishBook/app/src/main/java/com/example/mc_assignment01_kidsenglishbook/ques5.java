package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ques5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques5);


        Button KBtn=findViewById(R.id.correct5);
        Button WButton=findViewById(R.id.w1);
        Button IButton=findViewById(R.id.i1);
        Button UButton=findViewById(R.id.u1);

        //alert dialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setMessage("Wrong Answer! Please try again!");

        KBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ques5.this,congratulations.class);
                startActivity(intent);
            }
        });


        //wrong answers
        WButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        IButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        UButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });
    }
}