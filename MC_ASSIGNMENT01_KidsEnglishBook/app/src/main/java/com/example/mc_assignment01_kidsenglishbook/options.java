package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);


        Button learnBtn=findViewById(R.id.learn);
        Button examBtn=findViewById(R.id.exam);

        learnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent1=new Intent(options.this,AtoZ.class);
                startActivity(intent1);
            }
        });

        examBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(options.this,ques1.class);
                startActivity(intent2);
            }
        });
    }
}