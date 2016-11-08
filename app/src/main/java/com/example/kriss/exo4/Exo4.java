package com.example.kriss.exo4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Exo4 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo4);

        listView = (ListView) findViewById(R.id.listView);

        List<Album> albums = genererAlbums();
        AlbumAdapter adapter = new AlbumAdapter(Exo4.this, albums);
        listView.setAdapter(adapter);
    }

    private List<Album> genererAlbums(){
        List<Album> albums = new ArrayList<Album>();
        albums.add(new Album(Color.BLACK, "Black Bomb A", "Speech of Freedom"));
        albums.add(new Album(Color.BLUE, "Metallica", "Black"));
        albums.add(new Album(Color.GREEN, "Nirvana", "Nevermind"));
        albums.add(new Album(Color.RED, "Korn", "Follow the leader"));
        albums.add(new Album(Color.GRAY, "Eths", "Teratologie"));
        return albums;
    }
}
