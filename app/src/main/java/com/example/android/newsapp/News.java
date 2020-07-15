package com.example.android.newsapp;

public class News {
    private String sectionName;
    private String title;
    private String date;
    private String url;
    private String author;


    public News(String sectionName, String title, String date, String url, String author) {
        this.sectionName = sectionName;
        this.title = title;
        this.date = date;
        this.url = url;
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }
}
