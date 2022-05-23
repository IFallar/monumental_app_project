package com.example.monumentalfinalversion;

public class Model_Art {

    String artName;
    String artist;
    int artImage;

    public Model_Art(String artName, String artist, int artImage) {
        this.artName = artName;
        this.artist = artist;
        this.artImage = artImage;
    }

    public String getArtName() {
        return artName;
    }

    public String getArtist() {
        return artist;
    }

    public int getArtImage() {
        return artImage;
    }
}
