package com.example.model;

import java.io.Serializable;

public class News implements Serializable {
    private int newsPhoto;
    private String newsTitle;
    private String newsAuthor;
    private String newsSummary;
    private String newsContent;

    public News(int newsPhoto, String newsTitle, String newsAuthor, String newsSummary, String newsContent) {
        this.newsPhoto = newsPhoto;
        this.newsTitle = newsTitle;
        this.newsAuthor = newsAuthor;
        this.newsSummary = newsSummary;
        this.newsContent = newsContent;
    }

    public int getNewsPhoto() {
        return newsPhoto;
    }

    public void setNewsPhoto(int newsPhoto) {
        this.newsPhoto = newsPhoto;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public String getNewsSummary() {
        return newsSummary;
    }

    public void setNewsSummary(String newsSummary) {
        this.newsSummary = newsSummary;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
