package com.WebScrapping.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.WebScrapping.Model.ScrapeResponse;
import com.WebScrapping.Service.ScraperService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 

public class ScrapeController {
    @Autowired 
    private ScraperService scraperService;

    @GetMapping("/api/scrape")
    public ScrapeResponse scrape(@RequestParam String url) throws IOException {
        return scraperService.scrape(url);
    }
}
