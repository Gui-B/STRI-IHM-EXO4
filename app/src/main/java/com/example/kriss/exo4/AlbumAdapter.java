package com.example.kriss.exo4;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kriss on 08/11/16.
 */

public class AlbumAdapter  extends ArrayAdapter<Album> {
    public AlbumAdapter(Context context, List<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row,parent, false);
        }

        AlbumViewHolder viewHolder = (AlbumViewHolder) convertView.getTag();
        if ( viewHolder==null){
            viewHolder = new AlbumViewHolder();
            viewHolder.artiste = (TextView) convertView.findViewById(R.id.artiste);
            viewHolder.album = (TextView) convertView.findViewById(R.id.album);
            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(viewHolder);
        }
        Album album = getItem(position);

        viewHolder.artiste.setText(album.getArtiste());
        viewHolder.album.setText(album.getAlbum());
        viewHolder.img.setImageResource(album.getCover());

        return convertView;
    }
}
