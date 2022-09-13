package com.example.mc_assignment01_kidsenglishbook;


import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.database.Cursor;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AllAlphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_alphabets_list_view);

        ListView AlphabetListView = findViewById(R.id.listview);

        ArrayList<Alphabet> list=new ArrayList<>();
        list.add(new Alphabet("A"));
        list.add(new Alphabet("B"));
        list.add(new Alphabet("C"));
        list.add(new Alphabet("D"));
        list.add(new Alphabet("E"));
        list.add(new Alphabet("F"));
        list.add(new Alphabet("G"));
        list.add(new Alphabet("H"));
        list.add(new Alphabet("I"));
        list.add(new Alphabet("J"));
        list.add(new Alphabet("K"));
        list.add(new Alphabet("L"));
        list.add(new Alphabet("M"));
        list.add(new Alphabet("N"));
        list.add(new Alphabet("O"));
        list.add(new Alphabet("P"));
        list.add(new Alphabet("Q"));
        list.add(new Alphabet("R"));
        list.add(new Alphabet("S"));
        list.add(new Alphabet("T"));
        list.add(new Alphabet("U"));
        list.add(new Alphabet("V"));
        list.add(new Alphabet("W"));
        list.add(new Alphabet("X"));
        list.add(new Alphabet("Y"));
        list.add(new Alphabet("Z"));

        Log.d("name", String.valueOf(list.get(0)));
        AlphabetListAdapter arrayAdapter = new AlphabetListAdapter (this,list);


        AlphabetListView.setAdapter(arrayAdapter);

        AlphabetListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Alphabet a=(Alphabet) adapterView.getItemAtPosition(i);
                Toast.makeText(AllAlphabets.this, "You clicked "+a.getAlphabet(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}