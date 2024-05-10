package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.ws.BanqueService;

public class Main {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8081/", new BanqueService());
        System.out.println("Hello world!");


        System.out.println("Hello world!");
    }
}