package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ques3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);


        Button TBtn=findViewById(R.id.correct3);
        Button YButton=findViewById(R.id.y1);
        Button LButton=findViewById(R.id.l2);
        Button BButton=findViewById(R.id.b1);



        //alert dialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setMessage("Wrong Answer! Please try again!");


        TBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ques3.this,ques4.class);
                startActivity(intent);
            }
        });



        //wrong answers
        YButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        LButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });

        BButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });
    }
}