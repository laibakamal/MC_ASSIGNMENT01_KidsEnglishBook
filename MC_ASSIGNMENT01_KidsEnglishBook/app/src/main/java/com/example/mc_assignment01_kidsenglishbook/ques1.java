package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ques1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);

        //correct option button
        Button CBtn=findViewById(R.id.correct1);

        //others
        Button JButton=findViewById(R.id.j1);
        Button ZButton=findViewById(R.id.z1);
        Button AButton=findViewById(R.id.a2);

        //alert dialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setMessage("Wrong Answer! Please try again!");


        //correct answer
        CBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ques1.this,ques2.class);
                startActivity(intent);
            }
        });


        //wrong answers
        JButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        ZButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        AButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });
    }
}