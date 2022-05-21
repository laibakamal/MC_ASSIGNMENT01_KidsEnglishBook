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

    public void alphabetFor(View view)
    {
        Intent intent=new Intent(AtoZ.this,alphabet_for.class);

        switch(view.getId())
        {
            case R.id.a:
            {
                intent.putExtra("alphabet","A");
                startActivity(intent);
            }
            case R.id.b:
            {
                intent.putExtra("alphabet","B");
                startActivity(intent);
            }
            case R.id.c:
            {
                intent.putExtra("alphabet","C");
                startActivity(intent);
            }
            case R.id.d:
            {
                intent.putExtra("alphabet","D");
                startActivity(intent);
            }
            case R.id.e:
            {
                intent.putExtra("alphabet","E");
                startActivity(intent);
            }
            case R.id.f:
            {
                intent.putExtra("alphabet","F");
                startActivity(intent);
            }
            case R.id.g:
            {
                intent.putExtra("alphabet","G");
                startActivity(intent);
            }
            case R.id.h:
            {
                intent.putExtra("alphabet","H");
                startActivity(intent);
            }
            case R.id.i:
            {
                intent.putExtra("alphabet","I");
                startActivity(intent);
            }
            case R.id.j:
            {
                intent.putExtra("alphabet","J");
                startActivity(intent);
            }
            case R.id.k:
            {
                intent.putExtra("alphabet","K");
                startActivity(intent);
            }
            case R.id.l:
            {
                intent.putExtra("alphabet","L");
                startActivity(intent);
            }
            case R.id.m:
            {
                intent.putExtra("alphabet","M");
                startActivity(intent);
            }
            case R.id.n:
            {
                intent.putExtra("alphabet","N");
                startActivity(intent);
            }
            case R.id.o:
            {
                intent.putExtra("alphabet","O");
                startActivity(intent);
            }
            case R.id.p:
            {
                intent.putExtra("alphabet","P");
                startActivity(intent);
            }
            case R.id.q:
            {
                intent.putExtra("alphabet","Q");
                startActivity(intent);
            }
            case R.id.r:
            {
                intent.putExtra("alphabet","R");
                startActivity(intent);
            }
            case R.id.s:
            {
                intent.putExtra("alphabet","S");
                startActivity(intent);
            }
            case R.id.t:
            {
                intent.putExtra("alphabet","T");
                startActivity(intent);
            }
            case R.id.u:
            {
                intent.putExtra("alphabet","U");
                startActivity(intent);
            }
            case R.id.v:
            {
                intent.putExtra("alphabet","V");
                startActivity(intent);
            }
            case R.id.w:
            {
                intent.putExtra("alphabet","W");
                startActivity(intent);
            }
            case R.id.x:
            {
                intent.putExtra("alphabet","X");
                startActivity(intent);
            }
            case R.id.y:
            {
                intent.putExtra("alphabet","Y");
                startActivity(intent);
            }
            case R.id.z:
            {
                intent.putExtra("alphabet","Z");
                startActivity(intent);
            }

        }
    }
}