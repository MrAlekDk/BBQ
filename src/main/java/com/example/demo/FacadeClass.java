package com.example.demo;

import com.example.demo.models.JSONReader;

public class FacadeClass {

    JSONReader jsReader = new JSONReader();

    public FacadeClass(){}

    public String getRandomString() {
        try {
            return jsReader.getAllQuotes()[0].quote;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
