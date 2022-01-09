package com.example.newsmenia;

import android.graphics.ColorSpace;

import java.util.ArrayList;

public class mainNews {

    private String ststus;
    private String totalResults;
    private ArrayList<ModelClass> articles;

    public mainNews(String ststus, String totalResults, ArrayList<ModelClass> articles) {
        this.ststus = ststus;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStstus() {
        return ststus;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }


}
