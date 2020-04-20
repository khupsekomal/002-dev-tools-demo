package com.practice.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {


    // Expose "/" that return HelloWorld.
    @GetMapping("/")
    public String sayHello() {
        return "Hello world ! Time on Server is " + LocalDateTime.now();
    }


    //Expose "/workout" that return output of workout
    @GetMapping("/workout")
    public String getWorkout(){
        return "Run hard upto 5 k.";
    }

    //Expose "/fortune" that return daily fortune
    @GetMapping("/fortune")
    public String getFortune(){
        return "This is your lucky day.";
    }

}
