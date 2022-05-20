package com.example.mc_assignment01_kidsenglishbook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToRepoBtn=findViewById(R.id.goToRepo);
        goToRepoBtn.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://github.com/laibakamal/MC_ASSIGNMENT01_KidsEnglishBook"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}