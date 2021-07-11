package com.freitas.treinojava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String getMensagem(){
        return "Testando Inicial";
    }

   /* @GetMapping("/templates")
    public String getERROR(){
        return "globo.com";
    }*/
}
