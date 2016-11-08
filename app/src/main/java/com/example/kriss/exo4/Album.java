package com.example.kriss.exo4;

/**
 * Created by kriss on 08/11/16.
 */

public class Album {
    private int cover;
    private String artiste;
    private String album;

    public Album(int cover, String artiste, String album) {
        this.cover = cover;
        this.artiste = artiste;
        this.album = album;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
