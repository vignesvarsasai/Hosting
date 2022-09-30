package com.example.hosting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class HostingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HostingApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

    }

}
