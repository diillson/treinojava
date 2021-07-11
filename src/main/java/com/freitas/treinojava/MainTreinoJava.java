package com.freitas.treinojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.freitas.treinojava")
public class MainTreinoJava {
    public static void main(String [] args) {
        System.setProperty("spring.profiles.active" , "errorhandling");
        System.setProperty("spring.profiles.active" , "prod");
        System.setProperty("spring.profiles.active" , "dev");
        SpringApplication.run(MainTreinoJava.class, args);
    }
}
