package com.example.zalwe.restapiasynctask;

public class Temperature {


    String date;
    private String minTemperature;
    private String maxTemperature;
    String link;
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String getMinTemperature() {
        return minTemperature;
    }

    void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    String getMaxTemperature() {
        return maxTemperature;
    }

    void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}
