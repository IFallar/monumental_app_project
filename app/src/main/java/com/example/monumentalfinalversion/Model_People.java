package com.example.monumentalfinalversion;

public class Model_People {

    String peopleName;
    String peopleTitle;
    String peopleDetails;
    int peopleImage;

    public Model_People(String peopleName, String peopleTitle, String peopleDetails, int peopleImage) {
        this.peopleName = peopleName;
        this.peopleTitle = peopleTitle;
        this.peopleDetails = peopleDetails;
        this.peopleImage = peopleImage;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public String getPeopleTitle() {
        return peopleTitle;
    }

    public String getPeopleDetails() {
        return peopleDetails;
    }

    public int getPeopleImage() {
        return peopleImage;
    }
}
