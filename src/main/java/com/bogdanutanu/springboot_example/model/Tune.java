package com.bogdanutanu.springboot_example.model;

public class Tune {

    private String title;
    private Integer length;
    private String genre;

    public Tune(String title, Integer length, String genre) {
        this.title = title;
        this.length = length;
        this.genre = genre;
    }

    public Tune() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
