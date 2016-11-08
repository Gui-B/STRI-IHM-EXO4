package com.example.kriss.exo4;

/**
 * Created by kriss on 08/11/16.
 */

public class Album {
    private int color;
    private String artiste;
    private String Album;

    public Album(int color, String artiste, String Album) {
        this.color = color;
        this.artiste = artiste;
        this.Album = Album;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        this.Album = album;
    }
}
