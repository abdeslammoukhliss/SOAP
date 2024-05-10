package org.example;

import proxy.BanqueServiceService;
import proxy.BanqueWS;

public class Main {
    public static void main(String[] args) {


        BanqueWS proxy = new BanqueServiceService().getBanqueWSPort();
        System.out.println(proxy.conversion(1000));
        System.out.println("Hello world!");
    }
}