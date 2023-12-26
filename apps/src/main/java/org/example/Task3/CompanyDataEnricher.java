package org.example.Task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import lombok.Data;


@Data
public class CompanyDataEnricher {
    public Document source;

    public CompanyDataEnricher(String text) {
        this.source = Jsoup.parse(text);
    }

    public Document getSource() {
        return this.source;
    }

    public String getName() {

        String name = getSource().title();

        return name;
    }

    public String getLogo() {
        Elements logoElements = getSource().select("img");
        Element logoElement = logoElements.first();
        String logo = logoElement.attr("src");

        return logo;
    }

    public String getDescription() {

        Elements descriptionElement = getSource().select("meta[name=description]");
        String description = descriptionElement.attr("content");

        return description;
    }
}
