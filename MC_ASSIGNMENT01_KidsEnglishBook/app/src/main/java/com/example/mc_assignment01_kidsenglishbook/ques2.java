package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ques2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);

        Button LBtn=findViewById(R.id.correct2);
        Button KBtn=findViewById(R.id.k1);
        Button CBtn=findViewById(R.id.c1);
        Button ABtn=findViewById(R.id.a2);


        //alert dialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setMessage("Wrong Answer! Please try again!");



        LBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ques2.this,ques3.class);
                startActivity(intent);
            }
        });


        CBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        KBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        ABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });
    }
}