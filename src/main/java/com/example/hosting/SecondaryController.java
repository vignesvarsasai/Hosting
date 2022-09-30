package com.example.hosting;


import org.springframework.web.bind.annotation.*;

@RestController
public class SecondaryController {

    private static final String template = "Hello, %s!";
    @GetMapping("/Sayonara")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println(name);
        return String.format(template, name);
    }

}
