package com.example.kriss.exo4.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kriss.exo4.R;
import com.example.kriss.exo4.entity.Album;

/**
 * Created by kriss on 08/11/16.
 */

public class AlbumActivity extends Activity {
    private static final String KEY_COVER_ID = "album_cover";
    private static final String KEY_NAME = "album_name";
    private static final String KEY_BAND = "album_band";

    public static Intent newIntent(Album album, Context context){
        Intent i = new Intent(context, AlbumActivity.class);
        i.putExtra(KEY_COVER_ID, album.getCover());
        i.putExtra(KEY_NAME, album.getAlbum());
        i.putExtra(KEY_BAND, album.getArtiste());
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Intent i = getIntent();
        if (!(i.hasExtra(KEY_COVER_ID)&&i.hasExtra(KEY_BAND)&&i.hasExtra(KEY_NAME)))
            finish();
        int cover = i.getIntExtra(KEY_COVER_ID, 0);
        String name = i.getStringExtra(KEY_NAME);
        String band = i.getStringExtra(KEY_BAND);

        ((ImageView) findViewById(R.id.cover)).setImageResource(cover);
        ((TextView) findViewById(R.id.name)).setText(name);
        ((TextView) findViewById(R.id.band)).setText(band);

    }
}
