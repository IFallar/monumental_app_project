package com.example.monumentalfinalversion;

public class Model_Music {



    String musicName;
    String musicComposer;
    String musicDetails;
    int musicFile;

    public Model_Music(String musicName, String musicComposer, String musicDetails, int musicFile) {
        this.musicName = musicName;
        this.musicComposer = musicComposer;
        this.musicDetails = musicDetails;
        this.musicFile = musicFile;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getMusicComposer() {
        return musicComposer;
    }

    public String getMusicDetails() {
        return musicDetails;
    }

    public int getMusicFile() {
        return musicFile;
    }

}
