package com.WebScrapping.Model;

import java.util.List;

public class ScrapeResponse {
    private List<String> images;
    private List<String> videos;
    private List<String> links;
    
    public List<String> getImages() {
        return images;
    }
    public void setImages(List<String> images) {
        this.images = images;
    }
    public List<String> getVideos() {
        return videos;
    }
    public void setVideos(List<String> videos) {
        this.videos = videos;
    }
    public List<String> getLinks() {
        return links;
    }
    public void setLinks(List<String> links) {
        this.links = links;
    }
}
