package com.example.grasu.newsaplication;

public class News {
    private String title;
    private String section;
    private String url;
    private String publicationDate;
    private String author;

    public News(String title, String section, String url, String publicationDate,String author) {
        this.title = title;
        this.section = section;
        this.url = url;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getUrl() {
        return url;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
    public String getAuthor(){return author;}
}
