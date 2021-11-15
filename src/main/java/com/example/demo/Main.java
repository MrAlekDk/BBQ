package com.example.demo;

public class Main {

    public static void main(String[] args) {
        FacadeClass fc = new FacadeClass();

        for (int i = 0; i < 100; i++) {
            System.out.println(fc.getRandomString());
        }

    }
}
