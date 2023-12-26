package org.example.Task3;


public class Main {
    public static void main(String[] args) {
        OpenAIEnricher a = new OpenAIEnricher();
        String path = "https://nltu.edu.ua/";

        a.extract(path);
    }
}
