package com.example.demo.controllers;

import com.example.demo.models.JSONReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    JSONReader jsReader;

    @GetMapping("/")
    @ResponseBody
    public String getQuote() throws Exception {
        jsReader = new JSONReader();
        jsReader.damn();
        return "yo";
    }
}
