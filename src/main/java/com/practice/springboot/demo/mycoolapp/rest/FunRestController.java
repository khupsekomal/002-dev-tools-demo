package com.practice.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class FunRestController {
    // Expose "/" that return HelloWorld.

    @GetMapping("/")
    public String sayHello(){
        return "Hello world ! Time on Server is "+ LocalDateTime.now();
    }
}
