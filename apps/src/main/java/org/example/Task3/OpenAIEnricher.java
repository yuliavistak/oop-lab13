package org.example.Task3;

import lombok.SneakyThrows;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OpenAIEnricher {
    @SneakyThrows
    public static CompanyDataEnricher extract(String domain) {
        String API_KEY = "";
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();

        return new CompanyDataEnricher(text);
    }
    
}