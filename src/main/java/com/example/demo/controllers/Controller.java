package com.example.demo.controllers;

import com.example.demo.models.JSONReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    JSONReader jsReader = new JSONReader();

    @GetMapping("/")
    @ResponseBody
    public String getQuote() throws Exception {
        return jsReader.getAllQuotes()[0].quote;
    }
}
