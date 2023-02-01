package com.carros.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping("/get")
    public String get(){
        return "Olá!";
    }
    @PostMapping("/post")
    public String post(){
        return "Olá!";
    }
    @PutMapping("/put")
    public String put(){
        return "Olá!";
    }

}
