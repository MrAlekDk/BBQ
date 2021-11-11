package com.example.demo.models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;


public class JSONReader {
    public ArrayList<Quote> bbQuotes;


    public JSONReader(){
    }


    public void damn() throws Exception{
            String url = "https://www.breakingbadapi.com/api/quotes";
            URL urlObject = new URL(url);

            BufferedReader bf = new BufferedReader(new InputStreamReader(urlObject.openStream()));
            Quote[] allQuotes = new Gson().fromJson(bf,Quote[].class);
    }
}
