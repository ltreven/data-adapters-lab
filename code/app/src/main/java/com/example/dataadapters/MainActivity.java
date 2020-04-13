package com.example.dataadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = new String[10];
        names[0] = "Lourenço";
        names[1] = "Kanya";
        names[2] = "Peter";
        names[3] = "Nadine";
        names[4] = "Nano";
        names[5] = "Rodrigo";
        names[6] = "Danilo";
        names[7] = "Rainer";
        names[8] = "Paul";
        names[9] = "Felipe";

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        itemsAdapter.addAll(names);
        ListView listView = (ListView) findViewById(R.id.students);

        listView.setAdapter(itemsAdapter);


    }
}
