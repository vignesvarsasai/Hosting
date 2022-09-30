package com.example.hosting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryController {

    @GetMapping("/Greetings")
    public String index() {
        System.out.println("In Greetings Controller");
        return "Greetings from Spring Boot!";
    }
}
