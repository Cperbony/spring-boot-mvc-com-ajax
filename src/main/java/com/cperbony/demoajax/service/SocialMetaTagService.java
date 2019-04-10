package com.cperbony.demoajax.service;

import com.cperbony.demoajax.domain.SocialMetaTag;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SocialMetaTagService {

    public SocialMetaTag getOpenGraphByUrl(String url) {
        SocialMetaTag tag = new SocialMetaTag();
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
            tag.setTitle(doc.head().select("meta[property=og:title]").attr("content"));
            tag.setSite(doc.head().select("meta[property=og:site_name]").attr("content"));
            tag.setImage(doc.head().select("meta[property=og:image]").attr("content"));
            tag.setUrl(doc.head().select("meta[property=og:url]").attr("content"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tag;
    }
}
