package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " !! Have a good day :)";
    }

    @GetMapping("/internal/refresh")
    public void refreshCache() {
        System.out.println("Refreshing the server cache");
    }
}
