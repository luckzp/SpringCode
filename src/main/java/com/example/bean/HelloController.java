package com.example.bean;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @RequestMapping("hello")
    public String helloWorld(){
        return "hello";
    }


    @RequestMapping("you")
    public String you(){
        return "you";
    }
}
