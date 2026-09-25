package com.WebScrapping.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import com.WebScrapping.Model.ScrapeResponse;

@Service 
public class ScraperService {

    public ScrapeResponse scrape(String url) throws IOException {
        Document document = Jsoup.connect(url).userAgent("Chrome").timeout(5000).get();

        List<String>images=new ArrayList<>();
        List<String>videos=new ArrayList<>();
        List<String>links=new ArrayList<>();

        for(Element img : document.select("img")) {
            String src = img.absUrl("src");
            if(!src.isEmpty()){
                images.add(src);
            }
        }

        for(Element video : document.select("video")) {
            String src = video.absUrl("src");
            if(!src.isEmpty()) {
                videos.add(src);
            }
        }

        for(Element link : document.select("a[href]")) {
            String href = link.absUrl("href");
            if(!href.isEmpty()) {
                links.add(href);
            }
        }

        ScrapeResponse response = new ScrapeResponse();
        response.setImages(images);
        response.setVideos(videos);
        response.setLinks(links);

        return response;
    }
}
