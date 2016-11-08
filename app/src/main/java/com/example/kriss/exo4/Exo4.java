package com.example.kriss.exo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Exo4 extends AppCompatActivity {

    ListView listView;
    String[] artiste =new String[] { "David Guetta", "Nirvana", "Robin Des Bois", "Sean Paul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo4);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Exo4.this,
                android.R.layout.simple_list_item_1, artiste);
        listView.setAdapter(adapter);

    }
}
