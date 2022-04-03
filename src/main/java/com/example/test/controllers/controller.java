package com.example.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String landing() {
        return "landingpage";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/registrer")
    public String registrerPage(){
        return "registrer";
    }
}
