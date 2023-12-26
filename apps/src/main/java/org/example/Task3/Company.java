package org.example.Task3;

import lombok.Builder;

@Builder
public class Company {
    private String domain;
    private String description;
    private String logo;
    private String name;

    private CompanyDataEnricher db;


    public void getInfo() {
        OpenAIEnricher enricher = new OpenAIEnricher();
        db = enricher.extract(this.domain);

        this.name = db.getName();
        this.logo = db.getLogo();
        this.description = db.getDescription();

    }



}
