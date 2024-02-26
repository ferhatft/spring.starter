package com.turkcell.spring.starter.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @GetMapping
    public String a(@RequestParam("abc") String name){
        return  "Merhabe"+name;
    }

}
