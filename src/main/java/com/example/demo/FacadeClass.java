package com.example.demo;

public class FacadeClass {

    JSONReader jsReader = new JSONReader();
    RandomNumber number = new RandomNumber();

    public FacadeClass(){}

    public String getRandomString() {
        try {
            int quoteId = number.randomQuoteNr(jsReader.getAllQuotes().length);
            return jsReader.getAllQuotes()[quoteId].quote;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
