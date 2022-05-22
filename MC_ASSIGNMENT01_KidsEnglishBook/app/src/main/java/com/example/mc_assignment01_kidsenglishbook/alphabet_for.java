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
            imageView.setImageResource(R.drawable.a_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("B"))
        {
            imageView.setImageResource(R.drawable.b_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("C"))
        {
            imageView.setImageResource(R.drawable.c_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("D"))
        {
            imageView.setImageResource(R.drawable.d_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("E"))
        {
            imageView.setImageResource(R.drawable.e_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("F"))
        {
            imageView.setImageResource(R.drawable.f_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("G"))
        {
            imageView.setImageResource(R.drawable.g_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("H"))
        {
            imageView.setImageResource(R.drawable.h_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("I"))
        {
            imageView.setImageResource(R.drawable.i_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("J"))
        {
            imageView.setImageResource(R.drawable.j_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("K"))
        {
            imageView.setImageResource(R.drawable.k_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("L"))
        {
            imageView.setImageResource(R.drawable.l_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("M"))
        {
            imageView.setImageResource(R.drawable.m_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("N"))
        {
            imageView.setImageResource(R.drawable.n_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("O"))
        {
            imageView.setImageResource(R.drawable.o_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("P"))
        {
            imageView.setImageResource(R.drawable.p_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("Q"))
        {
            imageView.setImageResource(R.drawable.q_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("R"))
        {
            imageView.setImageResource(R.drawable.r_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("S"))
        {
            imageView.setImageResource(R.drawable.s_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("T"))
        {
            imageView.setImageResource(R.drawable.t_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("U"))
        {
            imageView.setImageResource(R.drawable.u_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("V"))
        {
            imageView.setImageResource(R.drawable.v_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("W"))
        {
            imageView.setImageResource(R.drawable.w_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("X"))
        {
            imageView.setImageResource(R.drawable.x_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("Y"))
        {
            imageView.setImageResource(R.drawable.y_);
        }
        else if(getIntent().getStringExtra("alphabet").equals("Z"))
        {
            imageView.setImageResource(R.drawable.z_);
        }
    }
}