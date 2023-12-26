package org.example.Task3;


public class Main {
    public static void main(String[] args) {
        String path = "insert-path";

        Company company = new Company(path);
        
        company.getInfo();
        System.out.println(company.toString());
    }
}
