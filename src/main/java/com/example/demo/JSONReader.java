package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

public class JSONReader {
    private Quote[] allQuotes;


    public JSONReader(){
    }


    public Quote[] getAllQuotes() throws Exception{
            String url = "https://www.breakingbadapi.com/api/quotes";
            URL urlObject = new URL(url);
            BufferedReader bf = new BufferedReader(new InputStreamReader(urlObject.openStream()));
            this.allQuotes = new Gson().fromJson(bf,Quote[].class);
            return allQuotes;
    }
}
