package com.Role.Based.Authentication.Role.Based.Authentication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exp {

    @GetMapping("/welcome")
    public String welcome(){

        return "welcome to my new website";
    }
}
