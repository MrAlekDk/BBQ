package com.example.demo;

public class FacadeClass {

    JSONReader jsReader = new JSONReader();
    RandomNumber number = new RandomNumber();

    public FacadeClass(){}

    public String getRandomString() {
        try {
            int quoteId = number.randomQuoteNr(jsReader.getAllQuotes().length);
            String yes = jsReader.getAllQuotes()[quoteId].quote_id + ".\t " + jsReader.getAllQuotes()[quoteId].quote + "\t - " +
                    jsReader.getAllQuotes()[quoteId].author + "\t Quote from: " + jsReader.getAllQuotes()[quoteId].series +"\n";
            return yes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}