package com.ds.trade404.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "welcome to Trade404";
    }

    @GetMapping("/api")
    public String secure() {
        return "welcome to Trade404 secure";
    }
}
