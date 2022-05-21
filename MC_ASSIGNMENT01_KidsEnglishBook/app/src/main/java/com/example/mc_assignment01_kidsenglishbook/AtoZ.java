package com.example.mc_assignment01_kidsenglishbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AtoZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ato_z);

    }

    public void alphabetFor(View view) {
        Intent intent=new Intent(AtoZ.this,alphabet_for.class);
        switch(view.getId())
        {
            case R.id.a:
            {
                intent.putExtra("alphabet","A");
                startActivity(intent);
            }
        }
    }
}