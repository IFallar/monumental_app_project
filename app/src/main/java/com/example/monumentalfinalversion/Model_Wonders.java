package com.example.monumentalfinalversion;

public class Model_Wonders {

    String wondersName;
    String wondersQuote;
    String wondersDetails;
    int wondersImage;
    int wondersImageGradient;


    public Model_Wonders(String wondersName, String wondersQuote, String wondersDetails, int wondersImage, int wondersImageGradient) {
        this.wondersName = wondersName;
        this.wondersQuote = wondersQuote;
        this.wondersDetails = wondersDetails;
        this.wondersImage = wondersImage;
        this.wondersImageGradient = wondersImageGradient;
    }

    public String getWondersName() {
        return wondersName;
    }

    public String getWondersQuote() {
        return wondersQuote;
    }

    public String getWondersDetails() {
        return wondersDetails;
    }

    public int getWondersImage() {
        return wondersImage;
    }

    public int getWondersImageGradient() {
        return wondersImageGradient;
    }
}
