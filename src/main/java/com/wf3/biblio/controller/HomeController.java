﻿package com.wf3.biblio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index () {
        return "index";
    }

    @GetMapping("/myAccount")
    public String myAccount () {
        return "myaccount";
    }


}
