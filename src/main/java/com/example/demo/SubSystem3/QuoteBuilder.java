package com.example.demo.SubSystem3;

import com.example.demo.SubSystem1.Quote;

public class QuoteBuilder {

    public QuoteBuilder(){}

    public String buildQuote(int randomNumber, Quote[] listOfQuotes){

        String quoteString = listOfQuotes[randomNumber].quote_id + ".\t " + listOfQuotes[randomNumber].quote + "\t - " +
                listOfQuotes[randomNumber].author + "\t Quote from: " + listOfQuotes[randomNumber].series +"\n";

        return quoteString;
    }
}
