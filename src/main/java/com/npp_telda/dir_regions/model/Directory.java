package com.npp_telda.dir_regions.model;

public class Directory {

    private Long id;
    private String title;
    private String shortTitle;

    public Directory() {
    }

    public Directory(Long id, String title, String shortTitle) {
        this.id = id;
        this.title = title;
        this.shortTitle = shortTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
}
