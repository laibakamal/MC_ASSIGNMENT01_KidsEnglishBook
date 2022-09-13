package com.example.mc_assignment01_kidsenglishbook;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;

        import java.util.ArrayList;

public class AlphabetListAdapter extends ArrayAdapter<Alphabet>  {

    public AlphabetListAdapter(@NonNull Context context, ArrayList<Alphabet> alphabet) {
        super(context, 0, alphabet);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Alphabet myclass = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.alphabet_button, parent, false);

        Button btn = convertView.findViewById(R.id.alphabetBtn);
        btn.setText( myclass.getAlphabet());


        if(position%2==0)
        {
            convertView.setBackgroundColor(Color.GRAY);
        }
        else if (position%2==1)
        {
            convertView.setBackgroundColor(Color.LTGRAY);
        }


        return convertView;
    }

}
