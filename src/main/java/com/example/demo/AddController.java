package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @GetMapping("/ms1/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS 1.1 - Additon = " + (a + b);
    }
}
