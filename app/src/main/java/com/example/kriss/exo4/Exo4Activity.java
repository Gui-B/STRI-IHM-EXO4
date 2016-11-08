package com.example.kriss.exo4;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Exo4Activity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo4);

        listView = (ListView) findViewById(R.id.listView);

        List<Album> albums = genererAlbums();
        AlbumAdapter adapter = new AlbumAdapter(Exo4Activity.this, albums);
        listView.setAdapter(adapter);
    }

    private List<Album> genererAlbums(){
        List<Album> albums = new ArrayList<Album>();
        albums.add(new Album(R.drawable.speech_of_freedom, "Black Bomb A", "Speech of Freedom"));
        albums.add(new Album(R.drawable.black_album, "Metallica", "Black"));
        albums.add(new Album(R.drawable.nevermind, "Nirvana", "Nevermind"));
        albums.add(new Album(R.drawable.follow_the_leader, "Korn", "Follow the leader"));
        albums.add(new Album(R.drawable.teratologie, "Eths", "Teratologie"));
        return albums;
    }
}
