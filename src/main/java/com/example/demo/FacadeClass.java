package com.example.demo;

public class FacadeClass implements BBQFacade{

    JSONReader jsReader = new JSONReader();
    RandomNumber number = new RandomNumber();
    QuoteBuilder stringBuilder = new QuoteBuilder();

    public FacadeClass(){}

    public String getRandomString() {
        try {
            Quote[] allQuotes = jsReader.getAllQuotes();
            int quoteId = number.randomQuoteNr(allQuotes.length);
            return stringBuilder.buildQuote(quoteId,allQuotes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}