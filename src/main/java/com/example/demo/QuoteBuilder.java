package com.example.demo;

public class QuoteBuilder {

    public QuoteBuilder(){}

    public String buildQuote(int randomNumber, Quote[] listOfQuotes){

        String quoteString = listOfQuotes[randomNumber].quote_id + ".\t " + listOfQuotes[randomNumber].quote + "\t - " +
                listOfQuotes[randomNumber].author + "\t Quote from: " + listOfQuotes[randomNumber].series +"\n";

        return quoteString;
    }
}
