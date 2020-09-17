package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

<<<<<<< HEAD
    @GetMapping("/greet")
    public String greet(){
        return "greet";
=======
    @GetMapping("/hi")
    public String hi(){
        return "hi";
>>>>>>> branch1
    }
}
