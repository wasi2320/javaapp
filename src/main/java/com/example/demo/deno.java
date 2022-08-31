package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deno {
    @GetMapping("/")
    public String index(){
        return "hello from srping booot";
    }
    
}
