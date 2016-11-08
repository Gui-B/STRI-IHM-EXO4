package com.example.kriss.exo4.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kriss.exo4.entity.Album;
import com.example.kriss.exo4.adapter.AlbumAdapter;
import com.example.kriss.exo4.R;
import com.example.kriss.exo4.interfaces.OnAlbumClickListener;

import java.util.ArrayList;
import java.util.List;

public class Exo5Activity extends Activity implements OnAlbumClickListener{

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo4);

        listView = (ListView) findViewById(R.id.listView);

        List<Album> albums = genererAlbums();
        AlbumAdapter adapter = new AlbumAdapter(Exo5Activity.this, albums, this);
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

    @Override
    public void onAlbumClick(Album album) {
        startActivity(AlbumActivity.newIntent(album, this));
    }
}
