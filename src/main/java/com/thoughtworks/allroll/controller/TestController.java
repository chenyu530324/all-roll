package com.thoughtworks.allroll.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
