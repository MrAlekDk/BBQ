package com.example.demo;

import java.util.Random;

public class RandomNumber {

    private Random random = new Random();

    public int randomQuoteNr(int size){
        int number = random.nextInt((size));
        return number;
    }

}
