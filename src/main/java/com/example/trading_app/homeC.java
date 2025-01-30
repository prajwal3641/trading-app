package com.example.trading_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeC {
    
    
    @GetMapping()
    public String home(){
        return "Hi i am working !!";
    }
}
