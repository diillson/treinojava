package com.freitas.treinojava.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @GetMapping("/")
    public String getMensagem() {
        return "Testando Inicial";
    }
   /* @GetMapping("/templates")
    public String getERROR(){
        return "globo.com";
    }*/
}
