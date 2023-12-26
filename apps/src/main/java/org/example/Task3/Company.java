package org.example.Task3;

import lombok.Data;
import lombok.ToString;

@ToString @Data
public class Company {
    private String domain;
    private String description;
    private String logo;
    private String name;
    private CompanyDataEnricher db;

    public Company(String domain) {
        this.domain = domain;
    }


    public void getInfo() {
        OpenAIEnricher enricher = new OpenAIEnricher();
        this.db = enricher.extract(getDomain());

        this.name = db.getName();
        this.logo = db.getLogo();
        this.description = db.getDescription();

    }
}
