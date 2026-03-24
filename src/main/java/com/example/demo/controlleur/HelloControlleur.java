package com.example.demo.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlleur {

    @GetMapping("/")
    public String sayHello() {
        return "hello CI/CD Devops de M1 Boc";
    }
}
