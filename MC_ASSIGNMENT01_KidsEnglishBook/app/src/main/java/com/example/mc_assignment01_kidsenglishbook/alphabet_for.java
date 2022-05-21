package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class alphabet_for extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_for);

        ImageView imageView=findViewById(R.id.forr);
        if(getIntent().getStringExtra("alphabet").equals("A"))
        {
            imageView.setImageResource(R.drawable.a);
        }
    }
}