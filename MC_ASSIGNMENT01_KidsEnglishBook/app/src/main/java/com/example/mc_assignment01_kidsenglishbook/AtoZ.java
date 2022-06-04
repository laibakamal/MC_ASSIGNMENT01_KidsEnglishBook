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
                break;
            }
            case R.id.b:
            {
                intent.putExtra("alphabet","B");
                startActivity(intent);
                break;
            }
            case R.id.c:
            {
                intent.putExtra("alphabet","C");
                startActivity(intent);
                break;
            }
            case R.id.d:
            {
                intent.putExtra("alphabet","D");
                startActivity(intent);
                break;
            }
            case R.id.e:
            {
                intent.putExtra("alphabet","E");
                startActivity(intent);
                break;
            }
            case R.id.f:
            {
                intent.putExtra("alphabet","F");
                startActivity(intent);
                break;
            }
            case R.id.g:
            {
                intent.putExtra("alphabet","G");
                startActivity(intent);
                break;
            }
            case R.id.h:
            {
                intent.putExtra("alphabet","H");
                startActivity(intent);
                break;
            }
            case R.id.i:
            {
                intent.putExtra("alphabet","I");
                startActivity(intent);
                break;
            }
            case R.id.j:
            {
                intent.putExtra("alphabet","J");
                startActivity(intent);
                break;
            }
            case R.id.k
            {
                intent.putExtra("alphabet","K");
                startActivity(intent);
                break;
            }
            case R.id.l:
            {
                intent.putExtra("alphabet","L");
                startActivity(intent);
                break;
            }
            case R.id.m:
            {
                intent.putExtra("alphabet","M");
                startActivity(intent);
                break;
            }
            case R.id.n:
            {
                intent.putExtra("alphabet","N");
                startActivity(intent);
                break;
            }
            case R.id.o:
            {
                intent.putExtra("alphabet","O");
                startActivity(intent);
                break;
            }
            case R.id.p:
            {
                intent.putExtra("alphabet","P");
                startActivity(intent);
                break;
            }
            case R.id.q:
            {
                intent.putExtra("alphabet","Q");
                startActivity(intent);
                break;
            }
            case R.id.r:
            {
                intent.putExtra("alphabet","R");
                startActivity(intent);
                break;
            }
            case R.id.s:
            {
                intent.putExtra("alphabet","S");
                startActivity(intent);
                break;
            }
            case R.id.t:
            {
                intent.putExtra("alphabet","T");
                startActivity(intent);
                break;
            }
            case R.id.u:
            {
                intent.putExtra("alphabet","U");
                startActivity(intent);
                break;
            }
            case R.id.v:
            {
                intent.putExtra("alphabet","V");
                startActivity(intent);
                break;
            }
            case R.id.w:
            {
                intent.putExtra("alphabet","W");
                startActivity(intent);
                break;
            }
            case R.id.x:
            {
                intent.putExtra("alphabet","X");
                startActivity(intent);
                break;
            }
            case R.id.y:
            {
                intent.putExtra("alphabet","Y");
                startActivity(intent);
                break;
            }
            case R.id.z:
            {
                intent.putExtra("alphabet","Z");
                startActivity(intent);
                break;
            }

        }
    }
}