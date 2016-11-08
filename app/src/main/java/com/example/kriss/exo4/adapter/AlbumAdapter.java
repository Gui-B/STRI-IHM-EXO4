package com.example.kriss.exo4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kriss.exo4.entity.Album;
import com.example.kriss.exo4.R;
import com.example.kriss.exo4.interfaces.OnAlbumClickListener;

import java.util.List;

/**
 * Created by kriss on 08/11/16.
 */

public class AlbumAdapter  extends ArrayAdapter<Album> {
    private OnAlbumClickListener onAlbumClickListener;

    public AlbumAdapter(Context context, List<Album> albums, OnAlbumClickListener onAlbumClickListener) {
        super(context, 0, albums);
        this.onAlbumClickListener = onAlbumClickListener;
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
            viewHolder.rowLayout = convertView.findViewById(R.id.row_layout);
            convertView.setTag(viewHolder);
        }
        final Album album = getItem(position);

        viewHolder.artiste.setText(album.getArtiste());
        viewHolder.album.setText(album.getAlbum());
        viewHolder.img.setImageResource(album.getCover());
        viewHolder.rowLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAlbumClickListener.onAlbumClick(album);
            }
        });

        return convertView;
    }
}
