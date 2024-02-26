package com.example.esercizioswagger.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    @GetMapping("/name")
    public String name(@RequestParam String name) {
        return name;
    }
    //GET: localhost:8080/v1/name?name=Ana
    @PostMapping("/reversename")
    public String reverseName(@RequestParam String name) {
        StringBuilder stringBuilder = new StringBuilder(name);
        return  stringBuilder.reverse().toString();
    }
    //POST: localhost:8080/v1/reversename?name=Maria
}
