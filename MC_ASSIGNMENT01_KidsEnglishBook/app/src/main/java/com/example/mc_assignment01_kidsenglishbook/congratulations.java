package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class congratulations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);


        Button GoToHomeBtn=findViewById(R.id.j1);


        GoToHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(congratulations.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}