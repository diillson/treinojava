package com.freitas.treinojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.freitas.treinojava")
public class MainTreinoJava {
    public static void main(String [] args) {
        System.setProperty("spring.profiles.active" , "errorhandling");
        SpringApplication.run(MainTreinoJava.class, args);
    }
}
