package com.example.akmal.firebasedatabasecrud;

/**
 * Created by akmal on 11/2/2017.
 */

public class Artist {
    String artistId;
    String artistName;

    public Artist(){}

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }
}
