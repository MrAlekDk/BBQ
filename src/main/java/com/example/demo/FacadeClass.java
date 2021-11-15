package com.example.demo;

import com.example.demo.SubSystem1.JSONReader;
import com.example.demo.SubSystem1.Quote;
import com.example.demo.SubSystem2.RandomNumber;
import com.example.demo.SubSystem3.QuoteBuilder;

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